package com.jikey.englishwithjikey.plus.ui.screens.lesson

import android.app.Application
import android.net.Uri
import androidx.lifecycle.viewModelScope
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.jikey.englishwithjikey.plus.data.datastore.DataStore
import com.jikey.englishwithjikey.plus.data.model.ui.screens.home.UiLessonScreen
import com.jikey.englishwithjikey.plus.ui.screens.lesson.repository.LessonRepository
import com.jikey.englishwithjikey.plus.ui.viewmodel.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LessonViewModel(application : Application) : BaseViewModel(application) {
    private val repository = LessonRepository(DataStore(application) , application)

    private val _uiState = MutableStateFlow(UiLessonScreen())
    val uiState : StateFlow<UiLessonScreen> = _uiState.asStateFlow()


    private var player : Player? = null

    init {
        viewModelScope.launch {
            player = ExoPlayer.Builder(getApplication()).build()
        }
    }

    fun getLesson(lessonId : String) {
        viewModelScope.launch(coroutineExceptionHandler) {
            showLoading()
            repository.getLessonRepository(lessonId) { fetchedLesson ->
                _uiState.value = fetchedLesson
            }
            hideLoading()
        }
    }

    fun preparePlayer(audioUrl : String) {
        viewModelScope.launch {
            player?.release()

            val audioUri = Uri.parse(audioUrl)

            player = ExoPlayer.Builder(getApplication()).build().apply {
                setMediaItem(MediaItem.fromUri(audioUri))
                prepare()
                playWhenReady = false

                addListener(object : Player.Listener {
                    override fun onIsPlayingChanged(isPlaying : Boolean) {
                        updateUiState { copy(isPlaying = isPlaying) }
                    }

                    override fun onPlaybackStateChanged(playbackState : Int) {
                        if (playbackState == Player.STATE_READY) {
                            val duration = this@apply.duration
                            updateUiState { copy(playbackDuration = duration) }
                        }
                    }

                    override fun onPositionDiscontinuity(
                        oldPosition : Player.PositionInfo ,
                        newPosition : Player.PositionInfo ,
                        reason : Int
                    ) {
                        val currentPosition = this@apply.currentPosition
                        updateUiState { copy(playbackPosition = currentPosition) }
                    }
                })
            }

            startPositionUpdateJob()
        }
    }

    fun playPause() {
        player?.let { player ->
            if (player.isPlaying) {
                player.pause()
            }
            else {
                player.playWhenReady = true
            }
        }
    }

    fun seekTo(position : Long) {
        player?.seekTo(position)
    }

    private fun startPositionUpdateJob() {
        viewModelScope.launch {
            while (true) {
                val currentPosition = player?.currentPosition ?: 0L
                updateUiState { copy(playbackPosition = currentPosition) }
                delay(timeMillis = 100)
                if (player?.isPlaying == false) {
                    break
                }
            }
        }
    }

    private fun updateUiState(update : UiLessonScreen.() -> UiLessonScreen) {
        _uiState.value = _uiState.value.update()
    }

    override fun onCleared() {
        super.onCleared()
        player?.release()
    }
}
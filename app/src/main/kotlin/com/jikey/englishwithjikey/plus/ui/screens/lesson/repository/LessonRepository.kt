package com.jikey.englishwithjikey.plus.ui.screens.lesson.repository

import android.app.Application
import com.jikey.englishwithjikey.plus.data.datastore.DataStore
import com.jikey.englishwithjikey.plus.data.model.ui.screens.home.UiLessonScreen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LessonRepository(
    dataStore : DataStore , application : Application ,
) : LessonRepositoryImplementation(application , dataStore) {

    suspend fun getLessonRepository(
        lessonId : String , onSuccess : (UiLessonScreen) -> Unit
    ) {
        withContext(Dispatchers.IO) {
            val lesson = getLessonImplementation(lessonId = lessonId)
            withContext(Dispatchers.Main) {
                onSuccess(lesson)
            }
        }
    }
}
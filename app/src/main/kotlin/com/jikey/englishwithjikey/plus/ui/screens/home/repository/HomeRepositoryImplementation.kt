package com.jikey.englishwithjikey.plus.ui.screens.home.repository

import android.app.Application
import com.jikey.englishwithjikey.plus.BuildConfig
import com.jikey.englishwithjikey.plus.constants.api.ApiConstants
import com.jikey.englishwithjikey.plus.data.core.AppCoreManager
import com.jikey.englishwithjikey.plus.data.datastore.DataStore
import com.jikey.englishwithjikey.plus.data.model.api.ApiHomeResponse
import com.jikey.englishwithjikey.plus.data.model.ui.screens.home.UiHomeLesson
import com.jikey.englishwithjikey.plus.data.model.ui.screens.home.UiHomeScreen
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.json.Json

abstract class HomeRepositoryImplementation(
    val application : Application ,
    val dataStore : DataStore ,
) {
    private val client : HttpClient = AppCoreManager.ktorClient

    private val baseUrl = BuildConfig.DEBUG.let { isDebug ->
        val environment = if (isDebug) "debug" else "release"
        "${ApiConstants.BASE_REPOSITORY_URL}/$environment/ro/home/api_get_lessons.json"
    }

    private val jsonParser = Json {
        ignoreUnknownKeys = true
        isLenient = true
    }

    suspend fun getHomeLessonsImplementation() : UiHomeScreen {
        return runCatching {
            val response = client.get(baseUrl)
            val jsonString = response.bodyAsText()

            val lessons = jsonString.takeUnless { it.isBlank() }
                    ?.let { jsonParser.decodeFromString<ApiHomeResponse>(it) }
                    ?.takeIf { it.data.isNotEmpty() }?.data?.mapNotNull { networkLesson ->
                        println("English with jikey Plus -> Fetched lesson: $networkLesson")
                        runCatching {
                            UiHomeLesson(
                                lessonId = networkLesson.lessonId ,
                                lessonTitle = networkLesson.lessonTitle ,
                                lessonType = networkLesson.lessonType ,
                                lessonThumbnailImageUrl = networkLesson.lessonThumbnailImageUrl ,
                                lessonDeepLinkPath = networkLesson.lessonDeepLinkPath
                            )
                        }.getOrNull()
                    }?.also { lessons ->
                        println("English with jikey Plus -> Fetched ${lessons.size} lessons")
                    } ?: emptyList()

            UiHomeScreen(lessons = ArrayList(lessons))
        }.getOrElse { exception ->
            println("English with jikey Plus -> Error: ${exception.message}")
            return@getOrElse UiHomeScreen()
        }
    }
}
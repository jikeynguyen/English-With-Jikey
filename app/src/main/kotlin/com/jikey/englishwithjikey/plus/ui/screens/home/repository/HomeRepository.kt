package com.jikey.englishwithjikey.plus.ui.screens.home.repository

import android.app.Application
import com.jikey.englishwithjikey.plus.data.datastore.DataStore
import com.jikey.englishwithjikey.plus.data.model.ui.screens.home.UiHomeScreen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HomeRepository(
    dataStore : DataStore , application : Application ,
) : HomeRepositoryImplementation(application , dataStore) {

    suspend fun getHomeLessonsRepository(onSuccess : (UiHomeScreen) -> Unit) {
        withContext(Dispatchers.IO) {
            val lessons = getHomeLessonsImplementation()
            withContext(Dispatchers.Main) {
                onSuccess(lessons)
            }
        }
    }
}
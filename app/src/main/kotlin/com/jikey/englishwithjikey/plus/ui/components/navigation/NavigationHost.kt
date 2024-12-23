package com.jikey.englishwithjikey.plus.ui.components.navigation

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.jikey.englishwithjikey.plus.data.model.ui.screens.home.UiHomeLesson

fun openLessonDetailActivity(context : Context , lesson : UiHomeLesson) {
    println("English with Jikey -> openLessonDetailActivity")

    println("English with Jikey -> openLessonDetailActivity checking deep link path -> ${lesson.lessonDeepLinkPath}")

    Intent(Intent.ACTION_VIEW , Uri.parse(lesson.lessonDeepLinkPath)).let { intent ->
        println("English with Jikey -> openLessonDetailActivity intent -> $intent")
        intent.resolveActivity(context.packageManager)?.let {
            println("English with Jikey -> openLessonDetailActivity start activity -> $it")
            context.startActivity(intent)
        }
    }
}
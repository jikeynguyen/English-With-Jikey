package com.jikey.englishwithjikey.plus.data.model.ui.screens.home

data class UiHomeScreen(
    val lessons : ArrayList<UiHomeLesson> = ArrayList()
)

data class UiHomeLesson(
    val lessonId : String = "" ,
    val lessonTitle : String = "" ,
    val lessonType : String = "" ,
    var lessonThumbnailImageUrl : String = "" ,
    val lessonDeepLinkPath : String = "" ,
)
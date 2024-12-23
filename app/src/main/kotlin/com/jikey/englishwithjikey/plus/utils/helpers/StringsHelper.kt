package com.jikey.englishwithjikey.plus.utils.helpers

import androidx.annotation.StringRes
import com.jikey.englishwithjikey.plus.data.core.AppCoreManager

fun getStringResource(@StringRes id : Int) : String {
    return AppCoreManager.instance.getString(id)
}
package com.jikey.englishwithjikey.plus.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Build

object ClipboardUtil {
    fun copyTextToClipboard(
        context : Context , label : String , text : String , onShowSnackbar : () -> Unit = {}
    ) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(label , text)
        clipboard.setPrimaryClip(clip)

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.S_V2) {
            onShowSnackbar()
        }
    }
}

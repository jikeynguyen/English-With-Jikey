package com.jikey.englishwithjikey.plus.ui.components.dialogs

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil3.ImageLoader
import coil3.compose.AsyncImage
import com.jikey.englishwithjikey.plus.BuildConfig
import com.jikey.englishwithjikey.plus.R

@Composable
fun VersionInfoAlertDialog(onDismiss : () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss ,
        text = { VersionInfoAlertDialogContent() } ,
        confirmButton = {} ,
    )
}

@Composable
fun VersionInfoAlertDialogContent() {
    val context : Context = LocalContext.current
    val copyright : String = context.getString(R.string.copyright)
    val appIcon : Drawable = context.packageManager.getApplicationIcon(context.packageName)
    val imageLoader = ImageLoader.Builder(context).build()

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        AsyncImage(
            model = appIcon ,
            contentDescription = null ,
            modifier = Modifier.size(48.dp) ,
            imageLoader = imageLoader
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = context.getString(R.string.app_full_name) ,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = stringResource(id = R.string.version , BuildConfig.VERSION_NAME) ,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = copyright , style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
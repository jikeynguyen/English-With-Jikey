package com.jikey.englishwithjikey.plus.ui.screens.settings.privacy.usage

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.jikey.englishwithjikey.plus.ui.screens.settings.display.theme.style.AppTheme

class UsageAndDiagnosticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    UsageAndDiagnosticsComposable(activity = this@UsageAndDiagnosticsActivity)
                }
            }
        }
    }
}
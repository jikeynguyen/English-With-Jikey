package com.jikey.englishwithjikey.plus.notifications.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.jikey.englishwithjikey.plus.notifications.workers.AppUsageNotificationWorker

class AppUsageNotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val workRequest = OneTimeWorkRequestBuilder<AppUsageNotificationWorker>().build()
        WorkManager.getInstance(context).enqueue(workRequest)
    }
}
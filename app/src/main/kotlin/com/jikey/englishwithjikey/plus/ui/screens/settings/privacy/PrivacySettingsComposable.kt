package com.jikey.englishwithjikey.plus.ui.screens.settings.privacy

import android.content.Context
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.jikey.englishwithjikey.plus.R
import com.jikey.englishwithjikey.plus.ui.components.PreferenceCategoryItem
import com.jikey.englishwithjikey.plus.ui.components.PreferenceItem
import com.jikey.englishwithjikey.plus.ui.components.navigation.TopAppBarScaffoldWithBackButton
import com.jikey.englishwithjikey.plus.ui.screens.settings.privacy.ads.AdsSettingsActivity
import com.jikey.englishwithjikey.plus.ui.screens.settings.privacy.permissions.PermissionsSettingsActivity
import com.jikey.englishwithjikey.plus.ui.screens.settings.privacy.usage.UsageAndDiagnosticsActivity
import com.jikey.englishwithjikey.plus.utils.IntentUtils

@Composable
fun PrivacySettingsComposable(activity: PrivacySettingsActivity) {
    val context: Context = LocalContext.current
    TopAppBarScaffoldWithBackButton(
        title = stringResource(id = R.string.security_and_privacy),
        onBackClicked = { activity.finish() }) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                    .fillMaxHeight()
                    .padding(paddingValues),
        ) {
            item {
                PreferenceCategoryItem(title = stringResource(id = R.string.privacy))
                PreferenceItem(
                    title = stringResource(id = R.string.privacy_policy),
                    summary = stringResource(id = R.string.summary_preference_settings_privacy_policy),
                    onClick = {
                        IntentUtils.openUrl(
                            context,
                            url = "https://sites.google.com/view/d4rk7355608/more/apps/privacy-policy"
                        )
                    })
                PreferenceItem(
                    title = stringResource(id = R.string.terms_of_service),
                    summary = stringResource(id = R.string.summary_preference_settings_terms_of_service),
                    onClick = {
                        IntentUtils.openUrl(
                            context,
                            url = "https://sites.google.com/view/d4rk7355608/more/apps/terms-of-service"
                        )
                    })
                PreferenceItem(
                    title = stringResource(id = R.string.code_of_conduct),
                    summary = stringResource(id = R.string.summary_preference_settings_code_of_conduct),
                    onClick = {
                        IntentUtils.openUrl(
                            context,
                            url = "https://sites.google.com/view/d4rk7355608/more/code-of-conduct"
                        )
                    })
                PreferenceItem(
                    title = stringResource(id = R.string.permissions),
                    summary = stringResource(id = R.string.summary_preference_settings_permissions),
                    onClick = {
                        IntentUtils.openActivity(
                            context, PermissionsSettingsActivity::class.java
                        )
                    })
                PreferenceItem(
                    title = stringResource(id = R.string.ads),
                    summary = stringResource(id = R.string.summary_preference_settings_ads),
                    onClick = {
                        IntentUtils.openActivity(
                            context, AdsSettingsActivity::class.java
                        )
                    })
                PreferenceItem(
                    title = stringResource(id = R.string.usage_and_diagnostics),
                    summary = stringResource(id = R.string.summary_preference_settings_usage_and_diagnostics),
                    onClick = {
                        IntentUtils.openActivity(
                            context, UsageAndDiagnosticsActivity::class.java
                        )
                    })
            }
            item {
                PreferenceCategoryItem(title = stringResource(id = R.string.legal))
                PreferenceItem(
                    title = stringResource(id = R.string.legal_notices),
                    summary = stringResource(id = R.string.summary_preference_settings_legal_notices),
                    onClick = {
                        IntentUtils.openUrl(
                            context,
                            url = "https://sites.google.com/view/d4rk7355608/more/apps/legal-notices"
                        )
                    })
                PreferenceItem(
                    title = stringResource(id = R.string.license),
                    summary = stringResource(id = R.string.summary_preference_settings_license),
                    onClick = {
                        IntentUtils.openUrl(
                            context, url = "https://www.gnu.org/licenses/gpl-3.0"
                        )
                    })
            }
        }
    }
}
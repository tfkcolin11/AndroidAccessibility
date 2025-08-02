package com.tfkcolin.androidaccessibility.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    val pushNotificationsEnabled = remember { mutableStateOf(true) }
    val emailUpdatesEnabled = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Main heading with semantic heading
        Text(
            text = "App Settings",
            modifier = Modifier.semantics { heading() },
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.size(24.dp))

        // Subheading with semantic heading
        Text(
            text = "Notification Settings",
            modifier = Modifier.semantics { heading() },
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.size(16.dp))

        // First toggleable row for Push Notifications
        androidx.compose.foundation.layout.Row(
            modifier = Modifier
                .toggleable(
                    value = pushNotificationsEnabled.value,
                    onValueChange = { pushNotificationsEnabled.value = it }
                )
                .size(minWidth = 48.dp, minHeight = 48.dp)
        ) {
            Switch(
                checked = pushNotificationsEnabled.value,
                onCheckedChange = { pushNotificationsEnabled.value = it },
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = "Push Notifications",
                style = androidx.compose.material3.MaterialTheme.typography.bodyLarge
            )
        }

        Spacer(modifier = Modifier.size(8.dp))

        // Second toggleable row for Email Updates
        androidx.compose.foundation.layout.Row(
            modifier = Modifier
                .toggleable(
                    value = emailUpdatesEnabled.value,
                    onValueChange = { emailUpdatesEnabled.value = it }
                )
                .size(minWidth = 48.dp, minHeight = 48.dp)
        ) {
            Switch(
                checked = emailUpdatesEnabled.value,
                onCheckedChange = { emailUpdatesEnabled.value = it },
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = "Email Updates",
                style = androidx.compose.material3.MaterialTheme.typography.bodyLarge
            )
        }
    }
}

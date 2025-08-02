package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
fun SettingsScreen(
    modifier: Modifier = Modifier
) {
    val pushNotificationsEnabled = remember { mutableStateOf(true) }
    val emailUpdatesEnabled = remember { mutableStateOf(true) }

    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // Main title - semantic heading (H1)
        Text(
            text = "App Settings",
            modifier = Modifier
                .semantics { heading() }
                .padding(bottom = 8.dp),
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium
        )

        // Notification settings heading - semantic heading (H2)
        Text(
            text = "Notification Settings",
            modifier = Modifier
                .semantics { heading() }
                .padding(bottom = 16.dp),
            style = androidx.compose.material3.MaterialTheme.typography.titleLarge
        )

        // Push notifications switch with proper accessibility
        SwitchWithLabel(
            checked = pushNotificationsEnabled.value,
            onCheckedChange = { pushNotificationsEnabled.value = it },
            label = "Push Notifications"
        )

        Spacer(modifier = Modifier.size(16.dp))

        // Email updates switch with proper accessibility
        SwitchWithLabel(
            checked = emailUpdatesEnabled.value,
            onCheckedChange = { emailUpdatesEnabled.value = it },
            label = "Email Updates"
        )
    }
}

@Composable
private fun SwitchWithLabel(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    label: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = label,
            style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

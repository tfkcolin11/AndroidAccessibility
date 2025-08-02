package com.tfkcolin.androidaccessibility.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
    val emailUpdatesEnabled = remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Main title - semantic heading
        Text(
            text = "App Settings",
            modifier = Modifier.semantics { heading() },
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.size(24.dp))

        // Notification settings heading - semantic heading
        Text(
            text = "Notification Settings",
            modifier = Modifier.semantics { heading() },
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.size(16.dp))

        // Push notifications toggle
        ToggleableRow(
            label = "Push Notifications",
            checked = pushNotificationsEnabled.value,
            onCheckedChange = { pushNotificationsEnabled.value = it }
        )

        Spacer(modifier = Modifier.size(8.dp))

        // Email updates toggle
        ToggleableRow(
            label = "Email Updates",
            checked = emailUpdatesEnabled.value,
            onCheckedChange = { emailUpdatesEnabled.value = it }
        )
    }
}

@Composable
private fun ToggleableRow(
    label: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    androidx.compose.material3.Row(
        modifier = Modifier
            .toggleable(
                value = checked,
                role = androidx.compose.ui.semantics.Role.Switch,
                onValueChange = onCheckedChange
            )
            .size(48.dp) // Minimum touch target size
    ) {
        Text(
            text = label,
            modifier = Modifier
                .weight(1f)
                .align(alignment = androidx.compose.ui.Alignment.CenterVertically)
        )
        Switch(
            checked = checked,
            onCheckedChange = null, // Handled by parent Row's toggleable
            modifier = Modifier.align(alignment = androidx.compose.ui.Alignment.CenterVertically)
        )
    }
}

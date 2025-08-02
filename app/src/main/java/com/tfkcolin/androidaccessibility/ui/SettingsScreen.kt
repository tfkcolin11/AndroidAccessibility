package com.tfkcolin.androidaccessibility.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
fun SettingsScreen(
    modifier: Modifier = Modifier
) {
    val pushNotificationsEnabled = remember { mutableStateOf(true) }
    val emailUpdatesEnabled = remember { mutableStateOf(true) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Main title - semantic heading (h1)
        Text(
            text = "App Settings",
            modifier = Modifier.semantics { heading() }
        )

        Spacer(modifier = Modifier.padding(16.dp))

        // Subheading - semantic heading (h2)
        Text(
            text = "Notification Settings",
            modifier = Modifier.semantics { heading() }
        )

        Spacer(modifier = Modifier.padding(8.dp))

        // Push Notifications switch
        SwitchSetting(
            label = "Push Notifications",
            checked = pushNotificationsEnabled.value,
            onCheckedChange = { pushNotificationsEnabled.value = it }
        )

        Spacer(modifier = Modifier.padding(8.dp))

        // Email Updates switch
        SwitchSetting(
            label = "Email Updates",
            checked = emailUpdatesEnabled.value,
            onCheckedChange = { emailUpdatesEnabled.value = it }
        )
    }
}

@Composable
private fun SwitchSetting(
    label: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = label)
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

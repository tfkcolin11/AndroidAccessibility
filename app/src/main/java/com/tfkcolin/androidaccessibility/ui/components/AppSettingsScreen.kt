package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppSettingsScreen(
    modifier: Modifier = Modifier
) {
    val pushNotificationsEnabled = remember { mutableStateOf(true) }
    val emailUpdatesEnabled = remember { mutableStateOf(true) }

    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "App Settings",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Text(
            text = "Notification Settings",
            style = MaterialTheme.typography.titleMedium
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        SwitchItem(
            label = "Push Notifications",
            checked = pushNotificationsEnabled.value,
            onCheckedChange = { pushNotificationsEnabled.value = it }
        )
        
        SwitchItem(
            label = "Email Updates",
            checked = emailUpdatesEnabled.value,
            onCheckedChange = { emailUpdatesEnabled.value = it }
        )
    }
}

@Composable
private fun SwitchItem(
    label: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

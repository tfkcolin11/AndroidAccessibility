package com.tfkcolin.androidaccessibility.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    val pushNotificationsEnabled = remember { mutableStateOf(true) }
    val emailUpdatesEnabled = remember { mutableStateOf(false) }
    
    val (focusRequester) = FocusRequester.createRefs()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "App Settings",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .semantics { heading() }
                .focusRequester(focusRequester)
        )
        
        Spacer(modifier = Modifier.size(24.dp))
        
        Text(
            text = "Notification Settings",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.semantics { heading() }
        )
        
        Spacer(modifier = Modifier.size(16.dp))
        
        // Push Notifications Toggle
        SwitchWithLabel(
            checked = pushNotificationsEnabled.value,
            onCheckedChange = { pushNotificationsEnabled.value = it },
            label = "Push Notifications",
            description = "Enable to receive push notifications from the app"
        )
        
        Spacer(modifier = Modifier.size(16.dp))
        
        // Email Updates Toggle
        SwitchWithLabel(
            checked = emailUpdatesEnabled.value,
            onCheckedChange = { emailUpdatesEnabled.value = it },
            label = "Email Updates",
            description = "Enable to receive email updates from the app"
        )
    }
}

@Composable
private fun SwitchWithLabel(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    label: String,
    description: String,
    modifier: Modifier = Modifier
) {
    androidx.compose.foundation.layout.Row(
        modifier = modifier.toggleable(
            value = checked,
            onValueChange = onCheckedChange,
            role = Role.Switch
        )
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .weight(1f)
                .padding(end = 16.dp)
        )
        Switch(
            checked = checked,
            onCheckedChange = null, // null because the parent Row handles the toggle
            modifier = Modifier.size(48.dp)
        )
    }
}

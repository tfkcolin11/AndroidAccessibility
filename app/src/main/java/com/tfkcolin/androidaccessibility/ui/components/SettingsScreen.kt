package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    val pushNotificationsEnabled = remember { mutableStateOf(true) }
    val emailUpdatesEnabled = remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "App Settings",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 24.sp
            )
        )
        
        Spacer(modifier = Modifier.padding(16.dp))
        
        Text(
            text = "Notification Settings",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 18.sp
            )
        )
        
        Spacer(modifier = Modifier.padding(8.dp))
        
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
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier.weight(1f)
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

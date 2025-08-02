package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            fontSize = 24.sp,
            modifier = Modifier.semantics { heading() }
        )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = "Notification Settings",
            fontSize = 20.sp,
            modifier = Modifier.semantics { heading() }
        )

        Spacer(modifier = Modifier.size(16.dp))

        // Push Notifications Toggle
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .toggleable(
                    value = pushNotificationsEnabled.value,
                    onValueChange = { pushNotificationsEnabled.value = it }
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Push Notifications",
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = pushNotificationsEnabled.value,
                onCheckedChange = { pushNotificationsEnabled.value = it },
                modifier = Modifier.padding(8.dp)
            )
        }

        Spacer(modifier = Modifier.size(16.dp))

        // Email Updates Toggle
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .toggleable(
                    value = emailUpdatesEnabled.value,
                    onValueChange = { emailUpdatesEnabled.value = it }
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Email Updates",
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = emailUpdatesEnabled.value,
                onCheckedChange = { emailUpdatesEnabled.value = it },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}

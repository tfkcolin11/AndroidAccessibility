package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun NotificationSwitch(
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .toggleable(
                value = isChecked,
                role = Role.Switch,
                onValueChange = onCheckedChange
            )
            .padding(8.dp), // Ensures minimum 48dp touch target
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Enable Notifications",
            modifier = Modifier.padding(end = 16.dp)
        )
        Switch(
            checked = isChecked,
            onCheckedChange = null, // Handled by parent Row toggleable
            modifier = Modifier.size(48.dp) // Ensures proper size
        )
    }
}

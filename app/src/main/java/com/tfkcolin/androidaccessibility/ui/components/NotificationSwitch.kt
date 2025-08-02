package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

/**
 * A reusable switch component with label for toggling notifications.
 */
@Composable
fun NotificationSwitch(
    modifier: Modifier = Modifier,
    initialChecked: Boolean = false,
    onCheckedChange: (Boolean) -> Unit
) {
    var checked by remember { mutableStateOf(initialChecked) }
    
    Row(
        modifier = modifier
            .toggleable(
                value = checked,
                role = Role.Switch,
                onValueChange = {
                    checked = it
                    onCheckedChange(it)
                }
            )
            .padding(8.dp) // Ensures minimum 48dp touch target
            .semantics {
                contentDescription = "Enable Notifications"
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Switch(
            checked = checked,
            onCheckedChange = null, // Handled by parent Row's toggleable
            modifier = Modifier.size(48.dp) // Minimum touch target size
        )
        Text(
            text = "Enable Notifications",
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

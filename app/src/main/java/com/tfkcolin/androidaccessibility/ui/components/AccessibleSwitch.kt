package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun AccessibleSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "Enable Notifications"
) {
    Row(
        modifier = modifier
            .toggleable(
                value = checked,
                enabled = true,
                role = Role.Switch,
                onValueChange = onCheckedChange
            )
            .semantics {
                role = Role.Switch
            }
            .clearAndSetSemantics {}
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            modifier = Modifier.padding(end = 16.dp)
        )
        Switch(
            checked = checked,
            onCheckedChange = null, // null because parent Row handles the toggle
            modifier = Modifier.semantics { }
        )
    }
}

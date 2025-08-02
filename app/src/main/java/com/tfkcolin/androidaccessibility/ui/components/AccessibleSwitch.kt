package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun AccessibleSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .toggleable(
                value = checked,
                onValueChange = onCheckedChange,
                role = Role.Switch
            )
            .padding(8.dp), // Ensures minimum touch target of 48dp
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Enable Notifications",
            modifier = Modifier.padding(end = 8.dp)
        )
        Switch(
            checked = checked,
            onCheckedChange = null // State controlled by parent Row
        )
    }
}

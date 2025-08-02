package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * A reusable switch component with label for notifications
 * @param isChecked Current state of the switch
 * @param onCheckedChange Callback when switch state changes
 * @param modifier Modifier for the component layout
 * @param label Text to display next to the switch (default: "Enable Notifications")
 */
@Composable
fun NotificationSwitch(
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "Enable Notifications"
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.width(8.dp))
        Switch(
            checked = isChecked,
            onCheckedChange = onCheckedChange
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NotificationSwitchPreview() {
    NotificationSwitch(
        isChecked = true,
        onCheckedChange = {}
    )
}

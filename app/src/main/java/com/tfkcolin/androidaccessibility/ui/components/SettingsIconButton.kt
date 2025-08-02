package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun SettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .semantics {
                contentDescription = "Settings"
            }
            .testTag("settingsButton")
    ) {
        Icon(
            imageVector = Icons.Filled.Settings,
            contentDescription = null // Decorative as the button has description
        )
    }
}

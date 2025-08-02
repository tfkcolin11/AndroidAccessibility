package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconColor: Color = Color.Unspecified,
    iconSize: Int = 24
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = "Settings",
            modifier = Modifier.size(iconSize.dp),
            tint = iconColor
        )
    }
}

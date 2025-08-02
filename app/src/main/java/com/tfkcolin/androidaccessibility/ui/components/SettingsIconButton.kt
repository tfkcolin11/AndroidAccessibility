package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

/**
 * A reusable accessible Settings IconButton that meets accessibility guidelines.
 * 
 * @param onClick The callback to be invoked when the button is clicked
 * @param modifier Optional modifier for the IconButton
 */
@Composable
fun SettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(48.dp) // Minimum touch target size for accessibility
            .semantics {
                contentDescription = "Settings" // Clear description for screen readers
            }
    ) {
        Icon(
            imageVector = Icons.Filled.Settings,
            contentDescription = null // Already described by parent button
        )
    }
}

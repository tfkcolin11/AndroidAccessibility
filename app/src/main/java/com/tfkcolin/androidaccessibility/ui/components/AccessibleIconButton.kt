package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.tfkcolin.androidaccessibility.R

/**
 * A reusable accessible IconButton with settings icon.
 * Includes:
 * - Meaningful content description for screen readers
 * - Minimum 48dp touch target size
 */
@Composable
fun AccessibleSettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .padding(12.dp) // Adds padding to ensure minimum 48dp touch target
    ) {
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = stringResource(R.string.settings_button_content_description),
            modifier = Modifier.padding(4.dp)
        )
    }
}

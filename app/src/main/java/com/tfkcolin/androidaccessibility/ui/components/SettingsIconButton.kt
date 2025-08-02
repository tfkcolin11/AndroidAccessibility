package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
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
 * A reusable accessible Settings icon button that meets accessibility guidelines.
 * 
 * @param onClick Callback when the button is clicked
 * @param modifier Optional Modifier to apply to the button
 */
@Composable
fun SettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(48.dp) // Minimum touch target size
    ) {
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = stringResource(R.string.settings_button_content_description),
            modifier = Modifier
                .size(24.dp) // Standard icon size
                .clickable(onClick = onClick) // Additional click handling
        )
    }
}

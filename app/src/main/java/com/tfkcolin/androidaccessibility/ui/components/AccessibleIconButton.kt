package com.tfkcolin.androidaccessibility.ui.components

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
 * A reusable accessible IconButton with built-in Settings icon.
 * 
 * @param onClick The callback to be invoked when the button is clicked
 * @param modifier The modifier to be applied to the button
 * @param contentDescription The description for accessibility services. Defaults to "Settings".
 */
@Composable
fun AccessibleSettingsButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String = stringResource(R.string.settings_content_description)
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.size(48.dp) // Minimum touch target size
    ) {
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = contentDescription
        )
    }
}

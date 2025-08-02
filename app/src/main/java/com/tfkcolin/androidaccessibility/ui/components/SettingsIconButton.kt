package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings

/**
 * A reusable IconButton with a Settings icon.
 *
 * @param onClick Called when the button is clicked
 * @param modifier Modifier to be applied to the button
 * @param contentDescription Description of the icon for accessibility
 */
@Composable
fun SettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String? = null
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = contentDescription
        )
    }
}

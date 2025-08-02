package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.tfkcolin.androidaccessibility.R

@Composable
fun SettingsIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.size(48.dp) // Ensures minimum touch target
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_settings),
            contentDescription = stringResource(id = R.string.settings_button_description),
            modifier = Modifier.size(24.dp)
        )
    }
}

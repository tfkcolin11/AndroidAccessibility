package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun ClickableText(
    text: String = "Read More",
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier
            .clickable(
                onClick = onClick,
                role = Role.Button
            )
            .padding(12.dp), // Ensures minimum touch target size of 48dp
    )
}

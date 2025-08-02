package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun ReadMoreText(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Read More",
        modifier = modifier
            .padding(16.dp) // Ensures minimum 48dp touch target (16dp padding on all sides)
            .clickable(
                onClick = onClick,
                role = null
            )
            .semantics {
                onClick(label = "Opens the full article", action = onClick)
            }
    )
}

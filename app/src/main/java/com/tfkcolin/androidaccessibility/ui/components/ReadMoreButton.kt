package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun ReadMoreButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Read More",
        modifier = modifier
            .clickable(
                onClick = onClick,
                // Ensure minimum 48dp touch target
                interactionSource = null,
                indication = null
            )
            .semantics {
                // Provide clear action description
                onClick(label = "Opens the full article", action = null)
            }
            .minimumTouchTargetSize()
    )
}

private fun Modifier.minimumTouchTargetSize(): Modifier =
    this.then(
        Modifier.sizeIn(
            minWidth = 48.dp,
            minHeight = 48.dp
        )
    )

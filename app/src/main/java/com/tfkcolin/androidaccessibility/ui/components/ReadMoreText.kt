package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics

@Composable
fun ReadMoreText(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Text(
        text = "Read More",
        modifier = modifier
            .clickable(onClick = onClick)
            .semantics {
                onClick(label = "Opens the full article", action = null)
            }
    )
}

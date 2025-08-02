package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle

@Composable
fun ReadMoreText(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle.Default
) {
    Text(
        text = "Read More",
        modifier = modifier
            .clickable(onClick = onClick)
            .semantics {
                onClick(label = "Opens the full article", action = null)
            },
        style = style
    )
}

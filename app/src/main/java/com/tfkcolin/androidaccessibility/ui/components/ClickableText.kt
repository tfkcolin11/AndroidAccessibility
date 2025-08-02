package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ClickableText(
    text: String = "Read More",
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier.clickable(onClick = onClick),
        textDecoration = TextDecoration.Underline
    )
}

@Preview
@Composable
private fun ClickableTextPreview() {
    ClickableText(onClick = {})
}

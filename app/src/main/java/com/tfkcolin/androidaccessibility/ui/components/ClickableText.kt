package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ClickableText(
    text: String = "Read More",
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(
        color = Color.Blue,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    ),
    onClick: () -> Unit
) {
    Text(
        text = text,
        modifier = modifier,
        style = style,
        onClick = onClick
    )
}

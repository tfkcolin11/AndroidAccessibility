package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import com.tfkcolin.androidaccessibility.ui.theme.Typography
import com.tfkcolin.androidaccessibility.ui.theme.Color

@Composable
fun ReadMoreText(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Text(
        text = "Read More",
        style = Typography.bodyMedium.copy(
            color = Color.Primary,
            textDecoration = TextDecoration.Underline
        ),
        modifier = modifier.clickable { onClick() }
    )
}

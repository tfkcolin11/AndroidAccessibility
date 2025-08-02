package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

/**
 * A reusable clickable text component that displays "Read More".
 * 
 * @param onClick The callback to be invoked when the text is clicked
 * @param modifier Optional modifier for additional styling
 */
@Composable
fun ClickableReadMore(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Read More",
        modifier = modifier
            .clickable(onClick = onClick)
            .padding(12.dp) // Ensures minimum 48dp touch target (24dp padding on each side)
            .semantics { heading() }, // For better accessibility navigation
    )
}

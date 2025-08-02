package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

/**
 * A purely decorative Image composable that is ignored by assistive technologies.
 * 
 * @param painter The painter to draw with
 * @param modifier Modifier to be applied to the layout
 * @param contentScale The scaling to be used on the content
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit
) {
    Image(
        painter = painter,
        contentDescription = null, // Important for accessibility - marks as decorative
        modifier = modifier,
        contentScale = contentScale
    )
}

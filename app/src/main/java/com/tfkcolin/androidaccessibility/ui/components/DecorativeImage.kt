package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

/**
 * A purely decorative Image composable that is ignored by assistive technologies.
 * 
 * @param painter The painter to draw
 * @param modifier Modifier to be applied to the layout
 * @param contentScale Optional scaling parameter for the image content
 * @param alpha Optional opacity parameter
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = 1f
) {
    Image(
        painter = painter,
        contentDescription = null, // Important for accessibility - marks as decorative
        modifier = modifier,
        contentScale = contentScale,
        alpha = alpha
    )
}

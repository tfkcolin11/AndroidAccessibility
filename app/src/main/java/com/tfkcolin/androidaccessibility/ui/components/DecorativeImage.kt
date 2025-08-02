package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

/**
 * A reusable Image composable intended purely for decoration.
 * This will be ignored by assistive technologies as it has no semantic meaning.
 * 
 * @param painter The painter to draw
 * @param modifier The modifier to apply to this layout
 * @param contentScale The scaling to apply to the image
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
) {
    Image(
        painter = painter,
        contentDescription = null,
        modifier = modifier,
        contentScale = contentScale
    )
}

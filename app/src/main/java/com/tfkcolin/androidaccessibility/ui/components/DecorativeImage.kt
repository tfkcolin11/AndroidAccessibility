package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

/**
 * A reusable Image composable for decorative purposes.
 * This image will be ignored by assistive technologies.
 * 
 * @param painter The painter to draw the image
 * @param modifier The modifier to be applied to the image
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painter,
        contentDescription = null, // This indicates the image is purely decorative
        modifier = modifier
    )
}

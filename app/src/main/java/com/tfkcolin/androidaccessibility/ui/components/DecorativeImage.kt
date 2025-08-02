package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

/**
 * A reusable decorative Image composable that will be ignored by assistive technologies.
 *
 * @param painter The painter to draw
 * @param modifier The modifier to be applied to the layout
 * @param alpha The opacity to be applied to the painter relative to its default opacity
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    modifier: Modifier = Modifier,
    alpha: Float = 1f
) {
    Image(
        painter = painter,
        contentDescription = null,
        modifier = modifier,
        alpha = alpha
    )
}

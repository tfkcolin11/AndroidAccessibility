package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

/**
 * A reusable decorative Image composable to be used as background patterns.
 *
 * @param painter The painter to draw the image
 * @param contentDescription The content description for accessibility
 * @param modifier The modifier to be applied to the layout
 * @param alpha The opacity of the image (0f to 1f)
 * @param contentScale The scaling option for the image content
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    alpha: Float = 1f,
    contentScale: ContentScale = ContentScale.FillBounds
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier.fillMaxSize(),
        alpha = alpha,
        contentScale = contentScale
    )
}

/**
 * Convenience function for loading decorative images from resources.
 *
 * @param resId The resource ID of the image
 * @param contentDescription The content description for accessibility
 * @param modifier The modifier to be applied to the layout
 * @param alpha The opacity of the image (0f to 1f)
 * @param contentScale The scaling option for the image content
 */
@Composable
fun DecorativeImage(
    resId: Int,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    alpha: Float = 1f,
    contentScale: ContentScale = ContentScale.FillBounds
) {
    DecorativeImage(
        painter = painterResource(id = resId),
        contentDescription = contentDescription,
        modifier = modifier,
        alpha = alpha,
        contentScale = contentScale
    )
}

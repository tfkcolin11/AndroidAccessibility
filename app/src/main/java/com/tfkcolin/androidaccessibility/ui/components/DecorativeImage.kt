package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

/**
 * A reusable decorative Image composable for background patterns.
 *
 * @param painter The painter to draw the image
 * @param contentDescription The content description for accessibility
 * @param modifier Modifier to be applied to the layout
 * @param alpha Opacity to be applied to the image from 0.0f to 1.0f
 * @param colorFilter ColorFilter to apply for the image
 * @param contentScale The scaling option to be used for the image
 */
@Composable
fun DecorativeImage(
    painter: Painter,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    alpha: Float = 1.0f,
    colorFilter: ColorFilter? = null,
    contentScale: ContentScale = ContentScale.Crop,
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier.fillMaxSize(),
        alpha = alpha,
        colorFilter = colorFilter,
        contentScale = contentScale
    )
}

/**
 * A variant that loads the image from resources.
 *
 * @param resId The resource ID of the image to load
 * @param contentDescription The content description for accessibility
 * @param modifier Modifier to be applied to the layout
 * @param alpha Opacity to be applied to the image from 0.0f to 1.0f
 * @param colorFilter ColorFilter to apply for the image
 * @param contentScale The scaling option to be used for the image
 */
@Composable
fun DecorativeImage(
    resId: Int,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    alpha: Float = 1.0f,
    colorFilter: ColorFilter? = null,
    contentScale: ContentScale = ContentScale.Crop,
) {
    DecorativeImage(
        painter = painterResource(id = resId),
        contentDescription = contentDescription,
        modifier = modifier,
        alpha = alpha,
        colorFilter = colorFilter,
        contentScale = contentScale
    )
}

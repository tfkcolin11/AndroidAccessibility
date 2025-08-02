package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

/**
 * A reusable decorative image composable for background patterns.
 * 
 * @param imageRes The image resource ID for the decorative pattern
 * @param contentDescription The description for accessibility (should be empty for decorative images)
 * @param contentScale The scale type for the image (defaults to ContentScale.Crop)
 * @param alpha The transparency of the image (defaults to 1f)
 * @param modifier Modifier to apply to this layout
 */
@Composable
fun DecorativeImage(
    imageRes: Int,
    contentDescription: String = "",
    contentScale: ContentScale = ContentScale.Crop,
    alpha: Float = 1f,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = contentDescription,
        contentScale = contentScale,
        alpha = alpha,
        modifier = modifier.fillMaxSize()
    )
}

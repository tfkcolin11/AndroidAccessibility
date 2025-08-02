package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

/**
 * A reusable decorative background pattern image composable.
 * 
 * @param imageRes The resource ID of the pattern image
 * @param contentScale The scale type for the image (default is ContentScale.Crop)
 * @param modifier Optional Modifier to apply to the image
 */
@Composable
fun BackgroundPattern(
    imageRes: Int,
    contentScale: ContentScale = ContentScale.Crop,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null, // Decorative image per accessibility guidelines
        contentScale = contentScale,
        modifier = modifier.fillMaxSize()
    )
}

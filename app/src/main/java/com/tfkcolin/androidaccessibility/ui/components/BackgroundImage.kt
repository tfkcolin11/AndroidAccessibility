package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

/**
 * A reusable decorative background image composable.
 * 
 * @param imageRes The resource ID of the background image
 * @param modifier The modifier to be applied to the image
 * @param contentScale The scale to use for the image content
 */
@Composable
fun BackgroundImage(
    imageRes: Int,
    modifier: Modifier = Modifier.fillMaxSize(),
    contentScale: ContentScale = ContentScale.Crop
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null, // Decorative image
        modifier = modifier,
        contentScale = contentScale
    )
}

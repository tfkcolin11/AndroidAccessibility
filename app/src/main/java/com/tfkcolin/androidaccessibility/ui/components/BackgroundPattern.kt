package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

/**
 * A reusable decorative background pattern composable.
 * 
 * @param painter The painter to draw the background pattern
 * @param modifier Modifier to be applied to the background pattern
 * @param contentScale The scale to be used for the background pattern
 */
@Composable
fun BackgroundPattern(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = null, // Decorative image
            contentScale = contentScale,
            modifier = Modifier.matchParentSize()
        )
    }
}

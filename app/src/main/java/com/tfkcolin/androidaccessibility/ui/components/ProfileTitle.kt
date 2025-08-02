package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ProfileTitle(modifier: Modifier = Modifier) {
    Text(
        text = "User Profile",
        modifier = modifier.semantics { heading() },
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
}

package com.tfkcolin.androidaccessibility.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ProfileTitle(modifier: Modifier = Modifier) {
    Text(
        text = "User Profile",
        style = MaterialTheme.typography.headlineLarge.copy(
            fontWeight = FontWeight.Bold
        ),
        modifier = modifier.semantics {
            heading()
        }
    )
}

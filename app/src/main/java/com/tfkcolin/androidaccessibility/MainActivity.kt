package com.tfkcolin.androidaccessibility

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tfkcolin.androidaccessibility.ui.theme.AndroidAccessibilityTheme
import com.tfkcolin.androidaccessibility.ui.components.AccessibleSwitch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidAccessibilityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NotificationSettings(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun NotificationSettings(modifier: Modifier = Modifier) {
    val notificationsEnabled = remember { mutableStateOf(false) }
    
    AccessibleSwitch(
        checked = notificationsEnabled.value,
        onCheckedChange = { notificationsEnabled.value = it },
        label = "Enable Notifications",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun NotificationSettingsPreview() {
    AndroidAccessibilityTheme {
        NotificationSettings()
    }
}

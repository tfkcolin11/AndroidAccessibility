package com.tfkcolin.androidaccessibility

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tfkcolin.androidaccessibility.ui.components.NotificationSwitch
import com.tfkcolin.androidaccessibility.ui.theme.AndroidAccessibilityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidAccessibilityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val notificationsEnabled = remember { mutableStateOf(false) }
    
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        NotificationSwitch(
            isChecked = notificationsEnabled.value,
            onCheckedChange = { notificationsEnabled.value = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAccessibilityTheme {
        Greeting("Android")
    }
}

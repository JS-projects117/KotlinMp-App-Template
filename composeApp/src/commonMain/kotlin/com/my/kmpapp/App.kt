package com.my.kmpapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import com.russhwolf.settings.Settings


val settings = Settings()

val appTextStyle = TextStyle(
    color = Color(0xFFF2E9C2),
    fontSize = 20.sp,
    fontStyle = FontStyle.Normal,
    fontWeight = FontWeight.SemiBold,
    fontFamily = FontFamily.Monospace,
    shadow = Shadow(
        color = Color.White.copy(alpha = 0.2f),
        blurRadius = 1f,
        offset = Offset(2f,5f)
    )
)
val titleTextStyle = TextStyle(
    color = Color.Black,
    fontSize = 30.sp,
    fontStyle = FontStyle.Normal,
    fontWeight = FontWeight.SemiBold,
    fontFamily = FontFamily.Monospace,
    shadow = Shadow(
        color = Color.Magenta.copy(alpha = 0.9f),
        blurRadius = 1f,
        offset = Offset(2f,5f)
    )
)

@Composable
fun ExampleComponents(){
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter) {
        Card(
            modifier = Modifier,
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondary)
        ) {
            Text(text = "Hello Compose", style = titleTextStyle)
        }
    }
}


@Composable
fun App(){
    Scaffold(modifier = Modifier.fillMaxSize()) {
        ExampleComponents()
    }
}
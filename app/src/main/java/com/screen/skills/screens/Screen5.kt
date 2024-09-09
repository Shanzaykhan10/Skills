package com.screen.skills.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Screen5() {
    Column {
        Box(
            modifier = Modifier
                .height(250.dp)
                .fillMaxSize()
                .background(
                    color = Color(0xFF063153)
                )
        )
        {

            Column(modifier = Modifier.padding(start = 25.dp, top = 110.dp)) {
                Text(
                    text = "Sign in to your\nAccount", color = Color.White,
                    fontSize = 30.sp
                )
                Text(
                    text = "Sign in to your Account", color = Color.Gray,
                    fontSize = 20.sp
                )
            }
        }
    }
}


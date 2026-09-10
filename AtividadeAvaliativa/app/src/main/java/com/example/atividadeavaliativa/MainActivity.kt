package com.example.atividadeavaliativa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF5F8FC)
                ) {
                    Exercicio2()
                }
            }
        }
    }
}

@Composable
fun Exercicio2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier
                .width(280.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF1E4268),
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(16.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(
                        RoundedCornerShape(12.dp)
                    )
                    .background(
                        Color(0xFF91AEC4)
                    )
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                text = "Fone Bluetooth X200",
                color = Color(0xFF0D3760),
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "R$ 249,90",
                    color = Color(0xFFFF5F4A),
                    fontSize = 12.sp
                )

                Spacer(
                    modifier = Modifier.weight(1f)
                )

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF1E4268)
                    ),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        text = "Comprar",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}
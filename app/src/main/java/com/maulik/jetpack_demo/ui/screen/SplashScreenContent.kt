package com.maulik.jetpack_demo.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maulik.jetpack_demo.R

@Composable
fun SplashScreenContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            ColorPainter(Color.Red),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Inside,
            contentDescription = "background color"
        )
        Image(
            painter = painterResource(id = R.drawable.ic_bike),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center)
        )

        Column(
            modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 50.dp)
        ) {
            Text(
                text = "Jetpack Compose",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 0.dp, 0.dp, 2.dp)
            )
            Text(
                text = "The Complete splash screen",
                color = Color.LightGray,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
package com.maulik.jetpack_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.maulik.jetpack_demo.ui.screen.SplashScreenContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenContent()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SplashScreenContent()
}


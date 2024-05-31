package com.example.appcompose1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcompose1.ui.theme.AppCompose1Theme
import com.example.appcompose1.ui.theme.Brown

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashPage(
                        message = "Coffee so good, your taste buds will love it.",
                        from = "The best grain, the finest roast, the powerful flavor."
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AppCompose1Theme {
            SplashPage(
                message = "Coffee so good, your taste buds will love it.",
                from = "The best grain, the finest roast, the powerful flavor."
            )
        }
    }

    @Composable
    fun GreetingText(onclick: () -> Unit, message: String, from: String, modifier: Modifier = Modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Text(
                text = message,
                fontSize =44.sp,
                lineHeight = 48.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .padding(36.dp, 420.dp, 36.dp, 16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = from,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(64.dp, 0.dp, 64.dp, 24.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Button(
                onClick = onclick,
                colors = ButtonDefaults.buttonColors(Brown),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .size(300.dp, 50.dp)
            ) {
                Text(
                    text = "Get Started",
                    fontSize = 16.sp
                )
            }
        }
    }

    @Composable
    fun SplashPage(message: String, from: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.coffe_onboarding)
        Box(
            modifier
                .background(Color.Black)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .size(615.dp, 500.dp)

            )
            GreetingText(
                onclick = {
                    val navigate = Intent(this@MainActivity, HomeActivity::class.java)
                    startActivity(navigate)
                },
                message = message,
                from = from,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }

}
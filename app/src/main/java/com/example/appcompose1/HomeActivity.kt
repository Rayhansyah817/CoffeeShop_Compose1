package com.example.appcompose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcompose1.ui.theme.AppCompose1Theme
import com.example.appcompose1.ui.theme.Brown

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview2() {
        AppCompose1Theme {
            HomePage()
        }
    }

    @Composable
    fun ImageProfile() {
        val image = painterResource(R.drawable.profile)
        Box {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)

            )
        }
    }

    @Composable
    fun TextLocation() {
        Column(
            modifier = Modifier.height(70.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Location",
                fontSize = 14.sp,
                color = Color.White

            )
            Text(
                text = "Blizen, Tanjungbalai",
                fontSize = 18.sp,
                color = Color.White
            )
        }

    }

    @Composable
    fun Search() {
        Box(
            modifier = Modifier
                .padding(0.dp, 20.dp, 0.dp, 30.dp)
                .height(55.dp)
                .width(340.dp)
                .background(color = Color.Black)
                .clip(
                    shape = RoundedCornerShape(5.dp)
                )
                .border(
                    width = 2.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
            ) {
                val image = painterResource(R.drawable.search_normal)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp)
                )

                Text(
                    text = "Search coffee",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Brown),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                ) {
                    val ic_furnitur = painterResource(R.drawable.furnitur_icon)
                    Image(
                        painter = ic_furnitur,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(0.dp)
                            .size(40.dp, 40.dp)
                    )
                }
            }

        }
    }

    @Composable
    fun Profile() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
        ) {
            TextLocation()
            Box(modifier = Modifier
                .width(140.dp)
            )
            ImageProfile()
        }
    }

    @Composable
    fun ImagePromo() {
        val image_promo = painterResource(R.drawable.coffe_home_promo1)
        Box(
            modifier = Modifier
                .size(340.dp, 170.dp)
        ) {
            Image(
                painter = image_promo,
                contentDescription = null,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .size(340.dp, 170.dp)
//                    .padding(0.dp, 100.dp, 0.dp, 30.dp)
//                    .height(140.dp)
//                    .width(315.dp)

            )
        }
    }

    @Composable
    fun MenuCoffe() {
        Box(
            modifier = Modifier
                .height(55.dp)
                .width(340.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Brown),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .height(40.dp)
                        .wrapContentWidth()
                ) {
                    Text(
                        text = "Cappuccino",
                        fontSize = 14.sp
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Brown),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .height(40.dp)
                        .wrapContentWidth()
                        .padding(10.dp, 0.dp)
                ) {
                    Text(
                        text = "Machiato",
                        fontSize = 14.sp
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Brown),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .height(40.dp)
                        .wrapContentWidth()
                ) {
                    Text(
                        text = "Latte",
                        fontSize = 14.sp
                    )
                }
            }
        }
    }

    @Composable
    fun ProductCoffe() {
        Box(
            modifier = Modifier
                .size(340.dp, 300.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.TopCenter)

            ) {
                Row {
                    Box(
                        modifier = Modifier
                            .size(150.dp, 240.dp)
                            .padding(0.dp, 0.dp, 10.dp, 0.dp)
                    ) {
                        Column {
                            val image = painterResource(R.drawable.coffe_product1)
                            Image(
                                painter = image,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(141.dp, 132.dp)

                            )
                            Text(
                                text = "Cappuccino",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "with Chocolate",
                                color = Color.Black,
                                fontSize = 14.sp
                            )
                            Row {
                                Text(
                                    text = "$4.53",
                                    fontSize = 22.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                                Button(
                                    onClick = { /*TODO*/ },
                                    colors = ButtonDefaults.buttonColors(Brown),
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(30.dp, 0.dp, 0.dp, 0.dp)
                                        .size(40.dp, 40.dp)
                                ) {
                                    val plus = painterResource(R.drawable.ic_plus)
                                    Image(painter = plus, contentDescription = null)
                                }
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .size(150.dp, 240.dp)
                            .padding(10.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Column {
                            val image = painterResource(R.drawable.coffe_product2)
                            Image(
                                painter = image,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(141.dp, 132.dp)

                            )
                            Text(
                                text = "Cappuccino",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "with Oat Milk",
                                color = Color.Black,
                                fontSize = 14.sp
                            )
                            Row {
                                Text(
                                    text = "$3.90",
                                    fontSize = 22.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                                Button(
                                    onClick = { /*TODO*/ },
                                    colors = ButtonDefaults.buttonColors(Brown),
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(30.dp, 0.dp, 0.dp, 0.dp)
                                        .size(40.dp, 40.dp)
                                ) {
                                    val plus = painterResource(R.drawable.ic_plus)
                                    Image(painter = plus, contentDescription = null)
                                }
                            }
                        }

                    }
                }

            }
        }
    }

    @Composable
    fun HomePage(modifier: Modifier = Modifier) {
        Box(
            modifier = modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .height(280.dp)
                    .fillMaxWidth()
                    .background(Color.Black)
            ) {

            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.TopCenter)
            ) {
                Profile()
                Search()
                ImagePromo()
                MenuCoffe()
                ProductCoffe()
            }

        }

    }

}
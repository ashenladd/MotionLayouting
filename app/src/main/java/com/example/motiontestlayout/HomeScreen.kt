package com.example.motiontestlayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = Color.LightGray)
                        .padding(12.dp),
                ) {
                    Row(modifier = Modifier.fillMaxSize()) {
                        Box(
                            modifier = Modifier
                                .size(76.dp)
                                .background(color = Color.Gray)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Column {
                            Text(
                                "Title",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.SemiBold
                            )

                            Text("Description")
                        }

                    }
                }

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        navController.navigateUp()
                    }
                ){
                    Text("Logout")
                }
            }
        }
    )
}

@Preview
@Composable
fun HomeScreenPreview() {
    Scaffold(modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = Color.LightGray)
                        .padding(12.dp),
                ) {
                    Row(modifier = Modifier.fillMaxSize()) {
                        Box(
                            modifier = Modifier
                                .size(76.dp)
                                .background(color = Color.Gray)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Column {
                            Text(
                                "Title",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.SemiBold
                            )

                            Text("Description")
                        }

                    }
                }

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {

                    }
                ){
                    Text("Logout")
                }
            }
        }
    )
}
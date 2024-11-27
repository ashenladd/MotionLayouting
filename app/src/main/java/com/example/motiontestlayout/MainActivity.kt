package com.example.motiontestlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.motiontestlayout.ui.theme.MotionTestLayoutTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MotionTestLayoutTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = LoginScreen
                ){
                    composable<LoginScreen>{
                        LoginScreen(navController)
                    }

                    composable<HomeScreen> {
                        HomeScreen(navController)
                    }
                }
            }
        }
    }
}

@Serializable
object LoginScreen

@Serializable
object HomeScreen


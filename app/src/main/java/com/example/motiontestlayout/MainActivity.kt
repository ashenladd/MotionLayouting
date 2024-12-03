package com.example.motiontestlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.motiontestlayout.feature.BookDetailScreen
import com.example.motiontestlayout.feature.HomeScreen
import com.example.motiontestlayout.feature.LoginScreen
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

                    composable<BookDetail> {
                        val args = it.toRoute<BookDetail>()
                        BookDetailScreen(param = args)
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

@Serializable
data class BookDetail(val bookId: String, val bookDesc: String)


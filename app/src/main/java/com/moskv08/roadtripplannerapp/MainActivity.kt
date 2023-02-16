package com.moskv08.roadtripplannerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.TripOrigin
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.moskv08.roadtripplannerapp.presentation.Navigation
import com.moskv08.roadtripplannerapp.presentation.navigation.BottomNavigationBar
import com.moskv08.roadtripplannerapp.presentation.navigation.components.BottomNavItem
import com.moskv08.stockmarketapp.ui.theme.RoadTripPlannerAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoadTripPlannerAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                items = listOf(
                                    BottomNavItem(
                                        name = "Home",
                                        route = "home_screen",
                                        icon = Icons.Default.Home
                                    ),
                                    BottomNavItem(
                                        name = "Trips",
                                        route = "trip_listing_screen",
                                        icon = Icons.Default.TripOrigin
                                    )
                                ),
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                }
                            )
                        }
                    ) {
                        Navigation(navController = navController)
                    }
                }
            }
        }
    }
}
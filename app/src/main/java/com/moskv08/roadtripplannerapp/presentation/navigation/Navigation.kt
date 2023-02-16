package com.moskv08.roadtripplannerapp.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moskv08.roadtripplannerapp.presentation.home.HomeScreen
import com.moskv08.roadtripplannerapp.presentation.trip_listing.TripListingScreen

@Composable
fun Navigation(
    navController: NavHostController
) {
//    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {

        // Home Screen
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
        }

        // List of all Trips
        composable(
            route = Screen.TripListingScreen.route
        ) {
            TripListingScreen(navController = navController)
        }

          // Trip Details
//        composable(
//            route = Screen.TripDetailScreen.route + "/{symbol}"
//        ) {
//            Screen.TripDetailScreen()
//        }
    }
}
package com.moskv08.roadtripplannerapp.presentation

sealed class Screen (val route: String) {
    object HomeScreen: Screen("home_screen")
    object TripListingScreen: Screen("trip_listing_screen")
    object TripDetailScreen: Screen("trip_detail_screen")
}
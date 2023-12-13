package com.example.compose2.navigation

sealed class Screens(val routeName: String) {
    data object MainScreen : Screens(routeName = "MainScreen")
    data object DetailsScreen : Screens(routeName = "DetailsScreen")
}
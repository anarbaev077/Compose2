package com.example.compose2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose2.MainScreen
import com.example.compose2.presentation.screens.FoodDetailsScreen

@Composable
fun FoodMainNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.routeName,
    ) {
        composable(route = Screens.MainScreen.routeName) {
            MainScreen(navController)
        }
        composable(route = Screens.DetailsScreen.routeName) {
            FoodDetailsScreen(navController)
        }
    }
}
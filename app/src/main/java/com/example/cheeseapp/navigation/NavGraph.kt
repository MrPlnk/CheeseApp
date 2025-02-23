package com.example.cheeseapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cheeseapp.srceens.SpecificCheeses.Cheese1Screen
import com.example.cheeseapp.srceens.SpecificCheeses.Cheese2Screen
import com.example.cheeseapp.srceens.home.HomeScreen


@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ){
        composable(route = Screens.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screens.Cheese1.route){
            Cheese1Screen(navController)
        }
        composable(route = Screens.Cheese2.route){
            Cheese2Screen(navController)
        }
    }
}
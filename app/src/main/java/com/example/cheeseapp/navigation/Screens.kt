package com.example.cheeseapp.navigation

sealed class Screens(val route: String) {
    object Home: Screens("home_screen")
    object Cheese1: Screens("cheese1_screen")
    object Cheese2: Screens("cheese2_screen")
}
package com.example.cheeseapp.ui.navigation

import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cheeseapp.ui.Screens.ManualScreen
import com.example.cheeseapp.ui.home.HomeDestination
import com.example.cheeseapp.ui.home.HomeScreen
import com.example.cheeseapp.ui.instruction.InstructionDestination
import com.example.cheeseapp.ui.instruction.InstructionScreen
import com.example.cheeseapp.ui.options.OptionsDestination
import com.example.cheeseapp.ui.options.OptionsScreen

@Composable
fun CheeseNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = OptionsDestination.route,
        modifier = modifier
    ){
        composable(route = OptionsDestination.route){
            OptionsScreen(

            )
        }
        composable(route = HomeDestination.route){
            HomeScreen(

            )
        }
        composable(route = InstructionDestination.route){
            InstructionScreen(

            )
        }
        composable(route = Calcu)
    }
}
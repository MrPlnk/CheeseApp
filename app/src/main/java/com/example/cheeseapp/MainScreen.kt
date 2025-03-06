package com.example.cheeseapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cheeseapp.ui.CheeseViewModel
import com.example.cheeseapp.ui.Screens.IngredientsScreen
import com.example.cheeseapp.ui.Screens.StartScreen

enum class MainScreen {
    Start,
    Ingredients,
    Pressing,
    Salting,
    Other,
    Manual
}

@Composable
fun CheeseApp(
    viewModel: CheeseViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
    ){
    Scaffold(
        topBar = {
            CheeseTopAppBar()
        }
    ) {  innerPaddin ->
        val uiState by viewModel.uiState.collectAsState()
        var userEnter by rememberSaveable { mutableStateOf("") }

        NavHost(
            navController = navController,
            startDestination = MainScreen.Start.name,
            modifier = Modifier.padding(innerPaddin),
        ){
            composable(route = MainScreen.Start.name) {
                StartScreen(
                    toIngredientsScreen = {navController.navigate(MainScreen.Ingredients.name)},
                    toOthersScreen = {navController.navigate(MainScreen.Other.name)},
                    toManualScreen = {navController.navigate(MainScreen.Manual.name)},
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.medium_padding))
                        .fillMaxSize()
                )
            }
            composable(route = MainScreen.Ingredients.name){
                IngredientsScreen(
                    uiState = uiState,
                    userEnter = userEnter,
                    onUserEntering = {value: String -> userEnter = value},
                    onKeyboardDone = {viewModel.updateMilk(userEnter)},
                    caclCalc = {value ->
                        var newValue = value.toFloatOrNull() ?: 0f
                        newValue *= 1
                        newValue.toString()
                    },
                    fermCalc = {value ->
                        var newValue = value.toFloatOrNull() ?: 0f
                        newValue *= 0.2f
                        newValue.toString()
                    },
                    chnCalc = {value ->
                        var newValue = value.toFloatOrNull() ?: 0f
                        newValue *= 0.02f
                        newValue.toString()
                    },
                    modifier = Modifier.padding(dimensionResource(R.dimen.medium_padding))
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheeseTopAppBar(
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = {
            Text(text = stringResource(R.string.app_name))
        }
    )
}
package com.example.cheeseapp.ui.home

import androidx.compose.runtime.Composable
import com.example.cheeseapp.R
import com.example.cheeseapp.ui.navigation.NavigationDestination

object HomeDestination: NavigationDestination{
    override val route = "home"
    override val titleRes = R.string.HomeRes
}

@Composable
fun HomeScreen(){

}
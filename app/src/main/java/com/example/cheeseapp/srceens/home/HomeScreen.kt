package com.example.cheeseapp.srceens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cheeseapp.navigation.Screens
import kotlin.random.Random

@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            @OptIn(ExperimentalMaterial3Api::class)
            TopAppBar(
            title = {Text(text = "Старорусский Сырок", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)},
            modifier = Modifier,
            colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
        )}
    ){
        val cheeses = listOf("Сырок 1", "Сырок 2")
        LazyColumn(modifier = Modifier
            .padding(it)
            .fillMaxSize()
        ){
            items(cheeses){cheese -> PlaceCheese(cheese, navController) }
        }
    }
}

@Composable
fun PlaceCheese(name: String, navController: NavController){
    Row(modifier = Modifier.fillMaxSize().clickable(onClick = {
        navController.navigate(Screens.Cheese1.route)
    })){
        Box(modifier = Modifier
            .padding(5.dp)
            .size(50.dp)
            .background(color = Color(
                Random.nextInt(255),
                Random.nextInt(255),
                Random.nextInt(255))))
        Text(text = name, fontSize = 28.sp, textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(5.dp)
                .fillMaxHeight()
                )
    }
}



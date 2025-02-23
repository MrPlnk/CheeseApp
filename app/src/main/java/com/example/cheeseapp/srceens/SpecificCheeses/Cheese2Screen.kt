package com.example.cheeseapp.srceens.SpecificCheeses

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Cheese2Screen(navController: NavController){
    Text("Привет, Илья", fontSize = 28.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    )
}
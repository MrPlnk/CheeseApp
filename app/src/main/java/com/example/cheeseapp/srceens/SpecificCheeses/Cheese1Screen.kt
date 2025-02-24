package com.example.cheeseapp.srceens.SpecificCheeses

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Cheese1Screen(navController: NavController){
    Scaffold(
        topBar = {
            @OptIn(ExperimentalMaterial3Api::class)
            (TopAppBar(
        title = {
            Text(
                text = "Сырок 1",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        modifier = Modifier,
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
    ))
        }
    ){
        innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxWidth()){
            Column(){
                Text("Ингридиенты", fontSize = 28.sp,
                    modifier = Modifier.padding(10.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center)
                Row(modifier = Modifier.padding(10.dp)
                    .fillMaxWidth()){
                    val milk_textField = remember{mutableStateOf("Вводить сюда")}
                    Text("Молоко", fontSize = 28.sp,
                        modifier = Modifier.weight(3f))
                    TextField(milk_textField.value, onValueChange = {milk_textField.value = it},
                        modifier = Modifier.weight(1f), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

                    )

                }
            }
        }
    }

}
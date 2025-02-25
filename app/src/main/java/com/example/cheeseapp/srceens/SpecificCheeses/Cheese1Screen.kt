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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cheeseapp.srceens.SpecificCheeses.DynamicComposable.RowElem_Text_TexField_Text

@Composable
fun Cheese1Screen(navController: NavController){
    val dim = arrayListOf("л", "мл", "мл", "гр", "гр", "л")
    val pair = arrayListOf("Молоко", "Кальций", "Фермент", "TCC-20", "Eyes", "MicroMilk")
    val stateMap = rememberPersistentStateMap(pair)

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
                for( i in pair.indices){
                    RowElem_Text_TexField_Text(pair[i], stateMap[pair[i]]!!, dim[i])
                }
            }
        }
    }

}

@Composable
fun rememberPersistentStateMap(list: List<String>, defaultLabel: String = ""): MutableMap<String, MutableState<String>> {
    val stateMap = remember { mutableStateMapOf<String, MutableState<String>>() }

    list.forEach { key ->
        if (stateMap[key] == null) {
            stateMap[key] = rememberSaveable { mutableStateOf(defaultLabel) }
        }
    }

    return stateMap
}

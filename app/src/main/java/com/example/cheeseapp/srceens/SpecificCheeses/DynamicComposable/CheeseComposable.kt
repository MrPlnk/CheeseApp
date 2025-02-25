package com.example.cheeseapp.srceens.SpecificCheeses.DynamicComposable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun RowElem_Text_TexField_Text(text: String, state: MutableState<String>, label: String = ""){
    Row(modifier = Modifier.padding(10.dp)
        .fillMaxWidth()){
        Text(text, fontSize = 28.sp,
            modifier = Modifier.weight(2f))
        TextField(
            value = state.value,
            onValueChange = { state.value = it },
            modifier = Modifier.weight(1f),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Text(label, fontSize = 28.sp,
            modifier = Modifier.weight(1f))
    }
}


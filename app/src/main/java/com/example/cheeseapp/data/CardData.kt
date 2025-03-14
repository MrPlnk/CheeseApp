package com.example.cheeseapp.data

import androidx.compose.runtime.MutableState

data class CardData(
    val inputTexts: List<InputText>,
    val lambdaFields: List<LambdaField>,
    val thread: (MutableList<MutableState<String>>) -> (String)
)
package com.example.cheeseapp.data.old

import androidx.annotation.StringRes
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class InputText(
    val userEnter: MutableState<String> = mutableStateOf(""),
    val onUserEntering: (String) -> Unit = {userEnter.value = it},
    @StringRes val parameterName: Int,
    @StringRes val parameterDimen: Int,
)
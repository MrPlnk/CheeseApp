package com.example.cheeseapp.ui.Screens

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cheeseapp.data.LambdaField
import com.example.cheeseapp.ui.components.PatternCard

@Composable
fun PressingScreen(
    userEnter: String,
    onUserEntering: (String) -> Unit,
    onKeyboardDone: () -> Unit,
    parameter: String,
    @StringRes parameterName: Int,
    @StringRes parameterDimen: Int,
    @StringRes cardsName: Int,
    cardFields: List<LambdaField>,
    modifier: Modifier = Modifier
) {
    PatternCard(
        userEnter = userEnter,
        onUserEntering = onUserEntering,
        onKeyboardDone = onKeyboardDone,
        parameter = parameter,
        cardsName = cardsName,
        parameterName = parameterName,
        parameterDimen = parameterDimen,
        cardFields = cardFields,
        modifier = modifier
    )
}
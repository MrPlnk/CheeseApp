package com.example.cheeseapp.ui.Screens

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cheeseapp.data.CardData
import com.example.cheeseapp.data.InputText
import com.example.cheeseapp.data.LambdaField
import com.example.cheeseapp.ui.components.PatternCard

@Composable
fun PressingScreen(
    @StringRes cardsName: Int,
    cardData: CardData,
    modifier: Modifier = Modifier
) {
    PatternCard(
        cardsName = cardsName,
        cardData = cardData,
        modifier = modifier
    )
}
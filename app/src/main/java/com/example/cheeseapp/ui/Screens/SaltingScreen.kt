package com.example.cheeseapp.ui.Screens

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R
import com.example.cheeseapp.data.CardData
import com.example.cheeseapp.data.Field
import com.example.cheeseapp.data.LambdaField
import com.example.cheeseapp.ui.components.FieldComposable
import com.example.cheeseapp.ui.components.LambdaFieldComposable
import com.example.cheeseapp.ui.components.PatternCard


@Composable
fun SaltingScreen(
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
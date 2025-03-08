package com.example.cheeseapp.ui.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    toIngredientsScreen: () -> Unit = {},
    toSaltingScreen: () -> Unit = {},
    toOthersScreen: () -> Unit = {},
    toManualScreen: () -> Unit = {},
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        HorizontalDivider(
            thickness = dimensionResource(R.dimen.thick_width),
            modifier = Modifier
                .padding(dimensionResource(R.dimen.small_padding)))

        StartScreenButton(
            onClick = toIngredientsScreen,
            text = stringResource(R.string.ingredients_card)
        )
        StartScreenButton(
            onClick = toSaltingScreen,
            text = stringResource(R.string.salting_card)
        )
        StartScreenButton(
            onClick = toOthersScreen,
            text = stringResource(R.string.other_info)
        )
        StartScreenButton(
            onClick = toManualScreen,
            text = stringResource(R.string.manual)
        )

        HorizontalDivider(
            thickness = dimensionResource(R.dimen.thick_width),
            modifier = Modifier
                .padding(dimensionResource(R.dimen.small_padding)))
    }
}

@Composable
fun StartScreenButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
){
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = text)
    }
}

@Preview
@Composable
fun StartScreenPreview(){
    StartScreen(
        modifier = Modifier
            .padding(dimensionResource(R.dimen.medium_padding))
            .fillMaxSize()
    )
}
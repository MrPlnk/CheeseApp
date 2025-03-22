package com.example.cheeseapp.ui.options

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.cheeseapp.R
import com.example.cheeseapp.ui.navigation.NavigationDestination

object OptionsDestination: NavigationDestination{
    override val route = "Options"
    override val titleRes = R.string.menu
}

@Composable
fun OptionsScreen(
    modifier: Modifier = Modifier,
    toIngredientsScreen: () -> Unit = {},
    toSaltingScreen: () -> Unit = {},
    toPressingScreen: () -> Unit = {},
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
            onClick = toManualScreen,
            text = stringResource(R.string.manual)
        )
        StartScreenButton(
            onClick = toIngredientsScreen,
            text = stringResource(R.string.ingredients_card)
        )
        StartScreenButton(
            onClick = toSaltingScreen,
            text = stringResource(R.string.salting_card)
        )
        StartScreenButton(
            onClick = toPressingScreen,
            text = stringResource(R.string.pressing_card)
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
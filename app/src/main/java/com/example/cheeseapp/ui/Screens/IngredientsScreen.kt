package com.example.cheeseapp.ui.Screens

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R
import com.example.cheeseapp.data.CheeseUiState
import com.example.cheeseapp.data.Field
import com.example.cheeseapp.ui.components.FieldComposable

@Composable
fun IngredientsScreen(
    uiState: CheeseUiState,
    userEnter: String = "14",
    onUserEntering: (String) -> Unit = {},
    onKeyboardDone: () -> Unit = {},
    caclCalc: (String) -> (String) = {value: String -> value},
    fermCalc: (String) -> (String) = {value: String -> value},
    chnCalc: (String) -> (String) = {value: String -> value},
    modifier: Modifier = Modifier,
){
    val milkAmount = uiState.amountOfMilk

    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.medium_padding))
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.small_padding))

        ){
            Text(
                text = stringResource(R.string.ingredients_card),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = dimensionResource(R.dimen.small_padding))
            )
            FieldComposable(Field(
                stringResource(R.string.calcium),
                caclCalc(milkAmount),
                stringResource(R.string.milliliters))
            )
            FieldComposable(Field(
                stringResource(R.string.ferment),
                fermCalc(milkAmount),
                stringResource(R.string.milliliters)
            ))
            FieldComposable(Field(
                stringResource(R.string.CHN),
                chnCalc(milkAmount),
                stringResource(R.string.gr)
            ))

            OutlinedTextField(
                value = userEnter,
                onValueChange = onUserEntering,
                singleLine = true,
                shape = shapes.large,
                label = {
                    Text(text = stringResource(R.string.milk) + ", ${stringResource(R.string.liters)}")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done,
                    keyboardType = KeyboardType.Number
                ),
                keyboardActions = KeyboardActions(
                    onDone = {onKeyboardDone()}
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
}


@Preview
@Composable
fun IngredientsScreenPreview(
    modifier: Modifier = Modifier,
){
    IngredientsScreen(CheeseUiState("28", "2"))
}
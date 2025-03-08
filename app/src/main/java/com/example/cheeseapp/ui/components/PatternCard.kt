package com.example.cheeseapp.ui.components

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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R
import com.example.cheeseapp.data.LambdaField

@Composable
fun PatternCard(
    userEnter: String,
    onUserEntering: (String) -> Unit,
    onKeyboardDone: () -> Unit,
    parameter: String,
    @StringRes parameterName: Int,
    @StringRes parameterDimen: Int,
    @StringRes cardsName: Int,
    cardFields: List<LambdaField>,
    modifier: Modifier = Modifier
){
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
                text = stringResource(cardsName),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = dimensionResource(R.dimen.small_padding))
            )
            cardFields.forEach{
                LambdaFieldComposable(
                    parameter,
                    it,
                )
            }

            OutlinedTextField(
                value = userEnter,
                onValueChange = onUserEntering,
                singleLine = true,
                shape = shapes.large,
                label = {
                    Text(text = stringResource(parameterName) + ", ${stringResource(parameterDimen)}")
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
fun PatternCardPreview(){
    var value by remember{ mutableStateOf("") }
    val onUserEnter: (String) -> Unit = {newValue: String -> value = newValue}
    val list: List<LambdaField> = listOf(
        LambdaField(
            R.string.minutes_15,
            {newValue: String ->
                (newValue.toFloat() * 2 / 1000).toString()},
            R.string.kg,

            )
    )
    val parameterName = R.string.milk
    val parameterDimen = R.string.liters

    PatternCard(
        userEnter = value,
        onUserEntering = onUserEnter,
        onKeyboardDone = {},
        parameter = value,
        parameterName = parameterName,
        parameterDimen = parameterDimen,
        cardsName = R.string.salting_card,
        cardFields = list,
    )
}
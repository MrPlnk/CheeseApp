package com.example.cheeseapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.cheeseapp.R
import com.example.cheeseapp.data.old.LambdaField

@Composable
fun LambdaFieldComposable(
    parameter: String,
    field: LambdaField,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier then Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = stringResource(field.text))
        Row(horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.small_padding))){
            Text(text = field.lambda(parameter))
            Text(text = stringResource(field.label))
        }

    }
}
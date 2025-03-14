package com.example.cheeseapp.ui.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.example.cheeseapp.data.InputText

@Composable
fun InputTextComposable(
    inputText: InputText,
    isLast: Boolean = false,
    modifier: Modifier = Modifier,
){
    OutlinedTextField(
        value = inputText.userEnter.value,
        onValueChange = inputText.onUserEntering,
        singleLine = true,
        shape = shapes.large,
        label = {
            Text(text = "${stringResource(inputText.parameterName)}, ${stringResource(inputText.parameterDimen)}")
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Number
        ),
        keyboardActions = KeyboardActions(
            onDone = {}
        ),
        modifier = modifier
    )
}
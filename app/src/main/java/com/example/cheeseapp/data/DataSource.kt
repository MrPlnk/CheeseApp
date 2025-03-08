package com.example.cheeseapp.data

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.stringResource
import com.example.cheeseapp.R

object DataSource {
    val saltingFields: List<LambdaField> = listOf(
        LambdaField(
            R.string.minutes_15,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 2f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.kg,
        ),
        LambdaField(
            R.string.minutes_30,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 3f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.kg
        ),
        LambdaField(
            R.string.minutes_120,
        {
            newValue: String ->
            val intermediateResult = newValue.toFloatOrNull() ?: 0f
            val result = intermediateResult * 5f / 1000f
            val resultString = result.toString()
            resultString
        },
        R.string.kg
        ),
        LambdaField(
            R.string.hours_10,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 8f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.kg
        )
    )
}
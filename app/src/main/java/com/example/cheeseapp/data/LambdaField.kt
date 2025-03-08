package com.example.cheeseapp.data

import androidx.annotation.StringRes

data class LambdaField(
    @StringRes val text: Int,
    val lambda: (String) -> (String),
    @StringRes val label: Int,
)

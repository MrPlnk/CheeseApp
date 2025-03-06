package com.example.cheeseapp.ui

import androidx.lifecycle.ViewModel
import com.example.cheeseapp.data.CheeseUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CheeseViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(CheeseUiState())
    val uiState: StateFlow<CheeseUiState> = _uiState.asStateFlow()

    fun updateMilk(newValue: String){
        _uiState.update{currentState ->
            currentState.copy(
                amountOfMilk = newValue
            )
        }
    }
}
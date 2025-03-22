package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Calculator
import kotlinx.coroutines.flow.Flow

// DAO для калькуляторов
@Dao
interface CalculatorDao {
    @Query("SELECT * FROM calculators WHERE menuId = :menuId")
    fun getCalculatorsForMenu(menuId: Int): Flow<List<Calculator>>

    @Insert
    suspend fun insert(calculator: Calculator)
}
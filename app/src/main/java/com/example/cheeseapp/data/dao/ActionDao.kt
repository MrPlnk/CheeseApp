package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Action
import kotlinx.coroutines.flow.Flow

// DAO для действий
@Dao
interface ActionDao {
    @Query("SELECT * FROM actions WHERE calculatorId = :calculatorId")
    fun getActionsForCalculator(calculatorId: Int): Flow<List<Action>>

    @Insert
    suspend fun insert(action: Action)
}
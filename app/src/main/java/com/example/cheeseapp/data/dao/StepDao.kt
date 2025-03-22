package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Step
import kotlinx.coroutines.flow.Flow

// DAO для шагов
@Dao
interface StepDao {
    @Query("SELECT * FROM steps WHERE instructionId = :instructionId")
    fun getStepsForInstruction(instructionId: Int): Flow<List<Step>>

    @Insert
    suspend fun insert(step: Step)
}
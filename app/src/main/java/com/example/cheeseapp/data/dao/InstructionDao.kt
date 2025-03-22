package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Instruction
import kotlinx.coroutines.flow.Flow

@Dao
interface InstructionDao {
    @Query("SELECT * FROM instructions WHERE menuId = :menuId")
    fun getInstructionsForMenu(menuId: Int): Flow<List<Instruction>>

    @Insert
    suspend fun insert(instruction: Instruction)
}
package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Field
import kotlinx.coroutines.flow.Flow

// DAO для полей
@Dao
interface FieldDao {
    @Query("SELECT * FROM fields WHERE calculatorId = :calculatorId")
    fun getFieldsForCalculator(calculatorId: Int): Flow<List<Field>>

    @Insert
    suspend fun insert(field: Field)
}
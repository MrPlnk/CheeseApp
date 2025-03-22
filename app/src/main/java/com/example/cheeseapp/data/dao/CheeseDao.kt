package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Cheese
import kotlinx.coroutines.flow.Flow

@Dao
interface CheeseDao {
    @Query("SELECT * FROM cheeses")
    fun getAll(): Flow<List<Cheese>>

    @Insert
    suspend fun insert(cheese: Cheese)
}
package com.example.cheeseapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cheeseapp.data.entity.Menu
import kotlinx.coroutines.flow.Flow

@Dao
interface MenuDao {
    @Query("SELECT * FROM menus")
    fun getAllMenus(): Flow<List<Menu>>

    @Insert
    suspend fun insert(menu: Menu)
}
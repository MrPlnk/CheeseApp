package com.example.cheeseapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menus")
data class Menu(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val instructions: Int?,
    val calculators: Int?
)
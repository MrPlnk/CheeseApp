package com.example.cheeseapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cheeses")
data class Cheese(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val menu: Int,
    val image: String?
)
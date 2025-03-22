package com.example.cheeseapp.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.cheeseapp.data.entity.Menu

// Таблица калькуляторов, связанных с меню.
@Entity(
    tableName = "calculators",
    foreignKeys = [
        ForeignKey(
            entity = Menu::class,
            parentColumns = ["id"],
            childColumns = ["menuId"],
            onDelete = ForeignKey.Companion.CASCADE
        )
    ],
    indices = [Index("menuId")]
)
data class Calculator(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val menuId: Int, // ссылка на меню
    val name: String
)
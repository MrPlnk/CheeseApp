package com.example.cheeseapp.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.cheeseapp.data.entity.Menu

// Таблица инструкций, связанных с меню.
@Entity(
    tableName = "instructions",
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
data class Instruction(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val menuId: Int, // ссылка на меню
    val title: String // название инструкции
)
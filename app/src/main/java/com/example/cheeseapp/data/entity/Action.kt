package com.example.cheeseapp.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.cheeseapp.data.entity.Calculator

// Таблица действий, связанных с калькулятором.
@Entity(
    tableName = "actions",
    foreignKeys = [
        ForeignKey(
            entity = Calculator::class,
            parentColumns = ["id"],
            childColumns = ["calculatorId"],
            onDelete = ForeignKey.Companion.CASCADE
        )
    ],
    indices = [Index("calculatorId")]
)
data class Action(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val value: Double,
    val unit: String,
    val calculatorId: Int // ссылка на калькулятор
)
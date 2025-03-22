package com.example.cheeseapp.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "steps",
    foreignKeys = [
        ForeignKey(
            entity = Instruction::class,
            parentColumns = ["id"],
            childColumns = ["instructionId"],
            onDelete = ForeignKey.Companion.CASCADE
        )
    ],
    indices = [Index("instructionId")]
)
data class Step(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val instructionId: Int, // ссылка на инструкцию
    val description: String
)
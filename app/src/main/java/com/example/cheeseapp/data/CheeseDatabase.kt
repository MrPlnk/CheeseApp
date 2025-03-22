package com.example.cheeseapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cheeseapp.data.entity.Action
import com.example.cheeseapp.data.dao.ActionDao
import com.example.cheeseapp.data.entity.Calculator
import com.example.cheeseapp.data.dao.CalculatorDao
import com.example.cheeseapp.data.entity.Cheese
import com.example.cheeseapp.data.dao.CheeseDao
import com.example.cheeseapp.data.entity.Field
import com.example.cheeseapp.data.dao.FieldDao
import com.example.cheeseapp.data.entity.Instruction
import com.example.cheeseapp.data.dao.InstructionDao
import com.example.cheeseapp.data.entity.Menu
import com.example.cheeseapp.data.dao.MenuDao
import com.example.cheeseapp.data.entity.Step
import com.example.cheeseapp.data.dao.StepDao

@Database(entities = [
    Cheese::class, Menu::class, Instruction::class, Step::class,
    Calculator::class, Field::class, Action::class
], version = 1)
abstract class CheeseDatabase : RoomDatabase() {
    abstract fun cheeseDao(): CheeseDao
    abstract fun menuDao(): MenuDao
    abstract fun instructionDao(): InstructionDao
    abstract fun stepDao(): StepDao
    abstract fun calculatorDao(): CalculatorDao
    abstract fun fieldDao(): FieldDao
    abstract fun actionDao(): ActionDao

    companion object {
        @Volatile
        private var Instance: CheeseDatabase? = null

        fun getDatabase(context: Context): CheeseDatabase{
            return Instance ?: synchronized(this){
                Room.databaseBuilder(context, CheeseDatabase::class.java, "item_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}

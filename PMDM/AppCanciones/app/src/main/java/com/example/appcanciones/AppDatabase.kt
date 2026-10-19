package com.example.appcanciones

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Cancion::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    abstract fun cancionDao(): DAOcancion
    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun obtener(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val db = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "canciones_db"
                ).build()
                INSTANCE ?: db.also { INSTANCE = it }
            }
        }
    }

}
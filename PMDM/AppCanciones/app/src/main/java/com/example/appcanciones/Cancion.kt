package com.example.appcanciones

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "canciones")
data class Cancion(
    @PrimaryKey (autoGenerate = true)
    val id: Int = 0,
    val titulo: String,
    val autor: String,
    val urlYoutube: String
)

package com.example.appcanciones

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAOcancion {
    @Insert
    suspend fun insertar(cancion: Cancion)

    @Query("SELECT * FROM canciones ORDER BY titulo ASC")
    suspend fun obtenerTodas(): List<Cancion>

    @Query("SELECT * FROM canciones WHERE id = :id LIMIT 1")
    suspend fun buscarPorId(id: Int): Cancion?

    @Update
    suspend fun actualizar(cancion: Cancion)

    @Delete
    suspend fun borrar(cancion: Cancion)

    @Query("DELETE FROM canciones WHERE id = :id")
    suspend fun borrarPorId(id: Int)
}
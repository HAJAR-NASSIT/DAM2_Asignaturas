package com.example.minijuegopaises

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.minijuegopaises.databinding.ActivityPregunta1Binding

class Pregunta1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPregunta1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPregunta1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener {
            val isSeleccionado = binding.groupProvincias.checkedRadioButtonId
            if (isSeleccionado != -1) {
                val radioButtonSeleccionado = findViewById<RadioButton>(isSeleccionado)
                val respuesta = radioButtonSeleccionado.text.toString()
                var puntos = 0

                    if(respuesta == "África"){
                        var puntos = 1
                    }
                val intentSiguiente = Intent(this, Pregunta2Activity::class.java).apply {
                    putExtra("PUNTUACION_ACUMULADA", puntos)
                }


            } else {
                Toast.makeText(this, "Por favor, selecciona una opción", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

    }
}
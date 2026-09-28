package com.example.vediojuegos

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vediojuegos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkEncuesta.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked){
                    binding.txtMensaje.text="¡Sí que te mola!"
                }else{
                    binding.txtMensaje.text="¡¿No te molan!?"
                }
        }
        binding.radioGroupJuegos.setOnCheckedChangeListener { _, idSeleccionado ->
            when (idSeleccionado) {
                R.id.radioFallout -> {
                    binding.txtMensaje.text = "Eligiste Fallout 4"
                }
                R.id.radioLol -> {
                    binding.txtMensaje.text = "Eligiste League of Legends"
                }
                R.id.radioFortnite -> {
                    binding.txtMensaje.text = "Eligiste Fortnite"
                }
                R.id.radioTeamFortress -> {
                    binding.txtMensaje.text = "Eligiste Team Fortress 2"

                }
            }
        }
    }
    }

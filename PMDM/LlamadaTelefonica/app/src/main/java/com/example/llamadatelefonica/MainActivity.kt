package com.example.llamadatelefonica

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.llamadatelefonica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pulsado = false
        binding.buttonImagen.setOnClickListener {

            pulsado = !pulsado
            if (pulsado){
                binding.myText.text="LLamando a Walter White"
                binding.buttonImagen.setImageResource(R.drawable.lamando)
                binding.walterImagen.setImageResource(R.drawable.walter)
            }else{
                binding.myText.text="LLamada Terminada"
                binding.buttonImagen.setImageResource(R.drawable.llamar)
                binding.walterImagen.setImageResource(R.drawable.walter_white)
            }

        }

    }
}
package com.example.intentexplecito

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.intentexplecito.databinding.ActivityProvinciaBinding

class ProvinciaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private lateinit var binding: ActivityProvinciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProvinciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProvincia.setOnClickListener {
            val isSeleccionado = binding.groupProvincias.checkedRadioButtonId
                 if(isSeleccionado!=-1) {
                         val radioButtonSeleccionado = findViewById<RadioButton>(isSeleccionado)
                         val provinciaTexto = radioButtonSeleccionado.text.toString()

                         val intentResult = Intent()
                         intentResult.putExtra("Provincia Key", provinciaTexto)

                         setResult(RESULT_OK, intentResult)

                         finish()
                 }else{
                         finish()
         }
        }
    }
}
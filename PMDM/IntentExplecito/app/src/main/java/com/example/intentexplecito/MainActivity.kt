package com.example.intentexplecito

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.intentexplecito.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val miluncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){ result ->
            if(result.resultCode == RESULT_OK){
                val datosrecibidos= result.data?.getStringExtra("Provincia Key")
                val miTexto = binding.txtEleccion
                miTexto.text = "Se ha seleccionado $datosrecibidos"
            }
        }

        binding.btnSelecionar.setOnClickListener {
            val intent = Intent(this, ProvinciaActivity::class.java)
            miluncher.launch(intent)
        }

    }
}
package com.example.intentimplicito

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.intentimplicito.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("UseKtx")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Abrir un web
        binding.btnWeb.setOnClickListener {
            val urltext = binding.editTextUrl.text
            val url = "https://$urltext".toUri()
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }

        //Abrir Mapa
        binding.btnMapa.setOnClickListener{
            val latitud = binding.editTextLatitud.text
            val longitud = binding.editTextLongitud.text
            val ubicacion = "geo:$latitud,$longitud?q=$latitud,$longitud".toUri()
            val intent = Intent(Intent.ACTION_VIEW, ubicacion)
            startActivity(intent)
        }
        //Abrir Email
        binding.btnMail.setOnClickListener {
            val email = binding.editTextMail.text
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$email")
                putExtra(Intent.EXTRA_SUBJECT, "Consulta")
                putExtra(Intent.EXTRA_TEXT, "Hola, quería consultar...")
            }
            startActivity(intent)
        }





    }
}
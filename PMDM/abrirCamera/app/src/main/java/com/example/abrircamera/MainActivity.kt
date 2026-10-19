package com.example.abrircamera

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.abrircamera.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//abrir youtube
        binding.buttonAbrirYoutub.setOnClickListener {
            val url = "https://www.youtube.com/".toUri()
            val intent = Intent(Intent.ACTION_VIEW, url)
            val chooser = Intent.createChooser(intent,"Elije una app")

            if (chooser.resolveActivity(packageManager) != null) {

                startActivity(chooser)

                Toast.makeText(
                    this,
                    "Abriendo YouTube",
                    Toast.LENGTH_LONG
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "No hay aplicaciones disponibles",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        //abrir camera
        binding.buttonAbrirCamera.setOnClickListener {

            val packageManager = getPackageManager()

            val cameraAvailable = packageManager.hasSystemFeature(
                PackageManager.FEATURE_CAMERA_ANY
            )

            if (cameraAvailable) {

                Toast.makeText(
                    this,
                    "Cámara disponible",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Cámara no disponible",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
        }


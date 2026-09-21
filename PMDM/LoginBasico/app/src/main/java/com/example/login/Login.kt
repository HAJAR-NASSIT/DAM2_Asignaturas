package com.example.login

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Login {

    fun validarLogin(actividad: AppCompatActivity){
        val usuario="admin"
        val pass="admin"

        val campoUsuario =actividad.findViewById<EditText>(R.id.editTextUsuario)
        val usuarioIntro=campoUsuario.text.toString()

        val campoPass = actividad.findViewById<EditText>(R.id.editTextTextPassword)
        val passIntro = campoPass.text.toString()

        if (usuarioIntro == usuario && passIntro == pass){
            androidx.appcompat.app.AlertDialog.Builder(actividad)
                .setTitle("Bienvenida")
                .setMessage("¡Hola, has iniciado sesión!")
                .setPositiveButton("OK", null)
                .show()

        }else{
            android.widget.Toast.makeText(actividad, "Datos incorrectos", android.widget.Toast.LENGTH_SHORT).show()
        }
    }
}
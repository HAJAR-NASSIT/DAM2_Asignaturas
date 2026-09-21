package com.example.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var button_Login : Button
    var intentos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener{
        if (binding.username.text.toString()=="admin" &&binding.password.text.toString() == "admin")
        {
            Toast.makeText(this, "Login succeful", Toast.LENGTH_SHORT).show()
        }else{
            intentos++
            Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            if(intentos == 3){
               binding.loginButton.isEnabled=false
                Toast.makeText(this, "has superado el maximo de intentos", Toast.LENGTH_SHORT).show()
            }
        }

        })
    }
}
package com.example.buttonandtextview

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textMessage = findViewById<TextView>(R.id.text_message)
        val buttonOk = findViewById<Button>(R.id.button_ok)
        val hello = getString(R.string.hello_world)
        val pulsar =getString(R.string.initial_text)
        fun changeText(){
            textMessage.text = if (textMessage.text.toString() == hello) pulsar else hello

}
        buttonOk.setOnClickListener {
            changeText()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
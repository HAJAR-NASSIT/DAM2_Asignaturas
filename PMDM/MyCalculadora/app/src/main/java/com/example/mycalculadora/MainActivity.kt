package com.example.mycalculadora

import android.os.Bundle
import android.view.View
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
//los variables
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val tvError = findViewById<TextView>(R.id.tvError)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val btnSuma = findViewById<Button>(R.id.btn_suma)
        val btnResta = findViewById<Button>(R.id.btn_resta)
        val btnMulti = findViewById<Button>(R.id.btn_multi)
        val btnDividir = findViewById<Button>(R.id.btn_dividir)
        val btnIgual = findViewById<Button>(R.id.btn_igual)
        val btnAc = findViewById<Button>(R.id.btn_ac)

        val operations = Operation()

        btn0.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("0")
        }

        btn1.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("1")
        }

        btn2.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("2")
        }

        btn3.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("3")
        }

        btn4.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("4")
        }

        btn5.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("5")
        }

        btn6.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("6")
        }

        btn7.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("7")
        }

        btn8.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("8")
        }

        btn9.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("9")
        }

        btnSuma.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("+")
        }

        btnResta.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("-")
        }

        btnMulti.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("*")
        }

        btnDividir.setOnClickListener {
            tvError.visibility = View.INVISIBLE
            tvResultado.append("/")
        }

        btnAc.setOnClickListener {
            tvResultado.text = ""
            tvError.visibility = View.INVISIBLE
        }

        btnIgual.setOnClickListener {

            try {
                val operacion = tvResultado.text.toString()
                val resultado = operations.doOperacion(operacion)

                tvResultado.text = resultado

            } catch (e: Exception) {
                tvError.visibility = View.VISIBLE
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
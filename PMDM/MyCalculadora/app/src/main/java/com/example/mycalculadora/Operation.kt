package com.example.mycalculadora

class Operation {
    fun doOperacion(operacion: String): String{
    var resultado =0
        if(operacion.contains("+")){
            val partes = operacion.split("+")
            val numero1 = partes[0].toInt()
            val numero2 = partes[1].toInt()
            resultado=numero1+numero2

        } else if (operacion.contains("-")) {

            val partes = operacion.split("-")

            val numero1 = partes[0].toInt()
            val numero2 = partes[1].toInt()

            resultado = numero1 - numero2

        } else if (operacion.contains("*")) {

            val partes = operacion.split("*")

            val numero1 = partes[0].toInt()
            val numero2 = partes[1].toInt()

            resultado = numero1 * numero2

        } else if (operacion.contains("/")) {

            val partes = operacion.split("/")

            val numero1 = partes[0].toInt()
            val numero2 = partes[1].toInt()

            resultado = numero1 / numero2
        }

        return resultado.toString()
    }
}
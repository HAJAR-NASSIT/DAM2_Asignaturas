package com.example.numeroprimo.operations

class Operations {

    fun isPrimeNumber(number: Int): Boolean {
        var isPrime = true

        if (number < 2) isPrime = false else
            for (i in 2 until number) {
                if (number % 2 == 0) {
                    isPrime = false
                }
            }
return isPrime
    }

}
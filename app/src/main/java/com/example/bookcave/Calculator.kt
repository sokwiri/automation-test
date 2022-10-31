package com.example.bookcave

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return if (a > b)
            a - b
        else
            b - a
    }
}
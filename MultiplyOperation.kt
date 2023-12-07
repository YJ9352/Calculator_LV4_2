package com.example.myapplication2.calculator;

class MultiplyOperation: AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return (num1 * num2).toDouble()
    }
}
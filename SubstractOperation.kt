package com.example.myapplication2.calculator;

class SubstractOperation: AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return (num1 - num2).toDouble()
    }
}
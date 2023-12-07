package com.example.myapplication2.calculator;

class Calculator {
     fun operate(num1: Double, num2: Double): Double {
        while (true) {
            println("연산자를 넣어주세요(+, -, *, /, %)")
            val operate = readLine()!!.toString()

            val operation: AbstractOperation? = when (operate) {
                "+" -> AddOperation()
                "-" -> SubstractOperation()
                "*" -> MultiplyOperation()
                "/" -> DivideOperation()
                "%" -> RemainderOperation()
                else -> null
            }

            if (operation != null) {
                return operation.operate(num1, num2)
            } else {
                println("허용되지 않는 연산자입니다. 다시 입력해주세요.")
            }
        }
    }
}
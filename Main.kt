package com.example.myapplication2.calculator;

fun main() {
    val calc = Calculator()

    try {
        print("첫 번째 숫자를 입력하세요: ")
        val num1 = readLine()!!.toDouble()
        print("두 번째 숫자를 입력하세요: ")
        val num2 = readLine()!!.toDouble()
        val result = calc.operate(num1, num2)
        println("정답은 ${result}입니다.")

    } catch (e:NumberFormatException) {
        println("숫자가 아닙니다. 다시 입력해주세요.")
    }

}
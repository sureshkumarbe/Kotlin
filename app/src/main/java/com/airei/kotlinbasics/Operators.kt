package com.airei.kotlinbasics

fun main(){
//    Arithmetic Operators: +, -, *, /, %
    val addition = 5 + 3
    println("Addition of two numbers is " + addition)

    val subtraction = 5 - 3
    println("Subtraction of two numbers is " + subtraction)

    val multiplication = 5 * 3
    println("Multiplication of two numbers is " + multiplication)

    val division = 5 / 3
    println("Division of two numbers is " + division)

    val divisiondecimal = 5.0 / 3.0
    println("Division of two numbers is " + divisiondecimal)

    val modulus = 5 % 3
    println("Modulus of two numbers is " + modulus)

//    Relational Operators: ==, !=, >, <, >=, <=
    val a = 5
    val b = 6

    println("The equal to result is " + (a == b))
    println("The not equal to result is " + (a != b))
    println("The greater than result is " + (a > b))
    println("The lesser than result is " + (a < b))
    println("The greater than equal to result is " + (a >= b))
    println("The lesser than equal to result is " + (a <= b))

//    Logical Operators: &&, ||, !
    val andresult: Boolean = true && true
    println("The AND result is " + andresult)

    val andresult1: Boolean = true && false
    println("The AND result is " + andresult1)

    val orresult: Boolean = true || true
    println("The OR result is " + orresult)

    val orresult1: Boolean = false || false
    println("The OR result is " + orresult1)

    val notresult: Boolean = !false
    println("The NOT result is " + notresult)

//    Assignment Operators: =, +=, -=, *=, /=, %=

//    Other Operators: ?:
}
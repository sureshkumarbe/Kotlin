package com.airei.kotlinbasics

fun main(){
//    if statement
    val age = 30
    if(age >= 18){
        println("You are adult")
    }

//    if-else statement
    val score = 60
    if(score >= 60){
        println("Pass")
    }else{
        println("Fail")
    }

//    when expression
    val day = 4
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thrusday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Unknown Day")
    }

//    nested conditionals
    val isRaining = true
    val isCold = false

    if(isRaining){
        if(isCold)
        {
            println("Use Umbrella and Coat")
        }else{
            println("Use only Umbrella")
        }
    }else{
        println("No need for an Umbrella")
    }
}
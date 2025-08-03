package com.airei.kotlinbasics

fun main(){
//    Range: Interval between 2 values



//    Closed Range : startValue..endValue
    val range = 1..5


//    Half-Open Range : startValue..excluding the endValue
    val range2 = 1 until 5

//    Iteration through a specific range
    for (i in range){
        println("Closed Range: " + i)
    }

    for (i in range2){
        println("Half-Open Range: " + i)
    }
}
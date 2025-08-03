package com.airei.kotlinbasics

fun main(){
//    Array: Its a collection of elements of the same data type organized in a specific order and
//    accessed by an index


//    Array Declaration
    val osnames = arrayOf("Windows", "Android", "MacOS", "Linux")

//    Accessing Elements
    val accesselements = osnames[0]
    println("Array Element is : " + accesselements)

//    Modifying the Elements
    osnames[0] = "BlackBerry"
    println("Array Element is : " + osnames[0])

//    Array Size
    val size = osnames.size
    println("Size of Array is : " + size)

//    Iterating through an Array
    for (i in osnames){
        println("Array of element is : $i")
    }

//    Using Lambda expression
    osnames.forEach { name -> println("Array Elements is $name") }
}
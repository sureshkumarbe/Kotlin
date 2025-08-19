package com.airei.kotlinbasics

fun main(){
//    Functions: Blocks of code that encapsulate a specific task or functionality

//    Function Declaration
//      fun functionName(parameter1 : Type, parameter2 : Type): ReturnType{
            // Function Body : Performs some operations, Optionally return a value
        //}

//    Function Calling
    sayHello("Suresh", "25")

    val result = sumTwoNumbers(10, 60)
    println("Sum of two integer numbers is : $result")

    val result1 = sumTwoNumbers(10.52, 60.75)
    println("Sum of two decimal numbers is : $result1")

}

// If the user not passing the age during the function calling, then by default it shows "Not Specified"

fun sayHello(name: String, age: String = "Not Specified"){
    println("Hello $name. Your age is $age")
}

fun sumTwoNumbers(a: Int, b: Int):Int{
    val c = a + b
    return c
}

// Function Overloading : Allow you define multiple functions with the same name in the same scope but with different parameters
fun sumTwoNumbers(a: Double, b: Double):Double{
    val c = a + b
    return c
}
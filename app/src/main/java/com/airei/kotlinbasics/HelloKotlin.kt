package com.airei.kotlinbasics

fun main(){
    // Singleline Comment


    /* A Variable is a named storage location in which you can store and manipulate data*/


    /*Steps to create Variable
        - Variable Declaration
        - Type Inference
        - Assigning Values

        var : Keyword used to declare a mutable(changeable) variable
        val : Keyword used to declare an immutable(constant) variable
     */

    // Mutable Variable
    var myAge : Int = 25

    // We can remove the type Int, because kotlin will automatically set the type based on the input value
    var newAge = 25

    // Immuatable Variable
    val pi : Double = 3.14159

    println("My Age is " + myAge)

    // Data Types
    // Byte : -128 to 127
    val myByte : Byte = 125

    // Short : -32786 to 32767
    val myShort : Short = 5476

    // Int : approx -2 Billion to 2 Billion
    val myInt : Int = 478595

    // Long : -9223372036854775807 to 9223372036854775807
    val myLong : Long = 88345945857745

    // Float : Store values with fractional parts
    val myFloat : Float = 3.14159f

    // Double : Store values with greater precision
    val myDouble : Double = 2.754456456

    // Boolean : True or False
    val isRaining : Boolean = true

    if(isRaining){
        println("Its raining outside")
    }else{
        println("Its not raining outside")
    }

    // Characters : Represent single character (Letter, Digit, Symbol or Special Characters..)
    val char : Char = 'A'
    val char1 : Char = '8'
    val char2 : Char = '\n'


    /*
    * Multiline Comment
    * */
}
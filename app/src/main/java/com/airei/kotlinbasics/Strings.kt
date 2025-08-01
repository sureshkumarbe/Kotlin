package com.airei.kotlinbasics

fun main(){
//    Strings are sequences of characters that are used to represent the text

//    String Declaration
    val text1: String = "Hello Friends"
    val text2: String = ", Welcome Back"

//    String Concatenation
    val text3 = text1 + text2
    println(text3)

//    String Templates
    val name = "Jack"
    val age = 25
    val info = "My name is $name and I am $age years old"
    println(info)

//    String Interpolation
    val x = 5
    val y = 3
    val result = "The sum of $x and $y is ${x + y}"
    println(result)

//    String Functions and Properties
    val text = "Welcome to our course"
    val length = text.length

    val subtext = text.substring(0,7) //starting index and ending index - 1
    println("The length of text is " + length)
    println("Sub Text is = " + subtext)

//    String Comparison
    val str1 = "Hello"
    val str2 = "Hai"
    val comparisonresult = str1.equals(str2)
    println("String Comparison of two string is = " + comparisonresult)
}
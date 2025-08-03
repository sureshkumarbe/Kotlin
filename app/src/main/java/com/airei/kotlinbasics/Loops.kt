package com.airei.kotlinbasics

fun main(){
//    Loops: Used to repeat a block of code multiple times
//    for loop (Defined Starting and Ending points)
    for (i in 1..5){
        println(i)
    }
//    while loop: repeats a block of code as long as a specified condition is true
    var count = 1
    while(count <= 5){
        println("Count: $count")
        count++
    }
//    do-while loop: it guarantees that the loop body is executed at least once because that condition is checked after the loop body
    var x = 1
    do{
        println("do-while loop : $x")
        x++
    }while (x < 5)

//    break: terminates the loop and transfer control to the statement following the loop
//    continue: skip the current iteration and proceeds to the next iteration of the loop
    for (i in 1..10){
        if(i==5){
            break
        }
        println(i)
    }

//    continue keyword
    for (i in 1..10){
        if(i%2 == 0){
            continue
        }
        println(i)
    }
}
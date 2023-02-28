package com.natiqhaciyef.millisoft_1.video


fun main() {
    // for -> daxili shertli dovr
    // while ->  on shert
    // do  while -> son shert

    // for
    for (i in 1..5){
        // 1, 2, 3, 4, 5
        println(i)
    }

    println("-------------")
    for (variable in 1 until 5){
        println(variable)
    }

    println("-------------")
    for (j in 5 downTo  1){
        println(j)
    }

    println("-------------")
    for (i in 1..10 step 2){
        println(i)
    }

    println("-------------")
    // while
    var a = 19
    var b = 20
    var c = 21

    while (a < c || c > b){
        println("Sonsuz dovr")
        a += 1
        b += 1
    }

    println("-------------")
    // do while
    do{
        println("Do while")
    }while (a > c)
}
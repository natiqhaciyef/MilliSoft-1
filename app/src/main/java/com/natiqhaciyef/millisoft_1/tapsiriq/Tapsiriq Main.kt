package com.natiqhaciyef.millisoft_1.tapsiriq

fun main() {

    // Usul 1
    for (i in 1 until 100) {
        if (i % 5 == 0)
            println(i)
    }

    // Usul 2
    for (i in 5 until 100 step 5) {
        println(i)
    }


    /*
    *        *
    *        ***
    *        *****
    *        *******
    * */

    for (i in 1..7 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    //#1  5..100 e qeder 7ye bolundukde qaliq 2 olan elementleri capa verin
    //#2  300..12ye qeder 35e bolundukde qaliq 1 olan ededleri capa verin
    //#3  1..1000 hem 5e hem 8e bolende qaliq 0 alinan edeleri capa verin
    //#4  1..1000 hem 5e bolende qaliq 0 ama 8 bolende qaliq 2 olan ededleri capa verin

    var x = 10
    for (i in 1..3) {
        if (i * 3 > 8 * x)
            println(i)
        x -= 5
    }
    println(x)

    println("------------------")
    x = 10
    var i = 1
    while (i <= 3) {
        if (i * 3 > 8 * x)
            println(i)
        x -= 5
        i += 1
    }


    var n = 1
    do {
        if (n > 5 && n % 7 == 2 && (n/7)%2 == 1) {
            println(n)
        }
        n += 1

    } while (n in 1..100)
}
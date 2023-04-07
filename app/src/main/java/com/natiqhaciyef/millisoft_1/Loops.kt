package com.natiqhaciyef.millisoft_1

fun main() {
    var range = 1..10
    for(alma in 1 until 10){
        println(alma)
    }

    println("--------------------")
    for (i in range step 2){
        println(i)
    }

    println("--------------------")
    for (i in 100 downTo 10 step 10){
        println(i)
    }

    println("--------------------")
    var b1 = true
    while(b1){
        println("Hello World")
        b1 = !b1
    }

    var a = 12
    var b = 14
    while (a < b){
        b -= 1
        println("A kicikdir B")
    }

    println("--------------------")
    var c = 56
    var d = 28
    do {
        println("Hello World DC")
    } while (c % d != 0)


    // Ic-ice dovr
    for (i in 1..10){
        for (j in 1..i){
            print(j)
        }
        println()
    }


    for (i in 1..10){
        for (j in 1..10){
            println("$i * $j = ${i*j}")
        }
    }


}
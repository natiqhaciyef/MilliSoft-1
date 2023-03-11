package com.natiqhaciyef.millisoft_1

fun main() {
    // if operatoru
    var a = 12
    var b = 120
    var c = 10


    var answer = if (a > b && a * b < c) {
        1
    } else if (a > b || a * b < c) {
        -1
    } else {
        100
    }

    var x = 0
    if (a > b && a * b < c) {
        x = 1
    } else if (a > b || a * b < c) {
        x = -1
    } else {
        x = 100
    }

    println(answer)

    // when operator
    var day = 5
    var ff = when(day){
        1 -> { println("Bazar ertesi") }
        2 -> { println("Chersenbe axshami") }
        3 -> { println("Chersenbe") }
        4 -> { println("Cume axsami") }
        5 -> { println("Cume") }
        6 -> { println("Shenbe") }
        7 -> { println("Bazar") }
        else -> { println("Bele bir gun olmur") }
    }

    println(ff)

    var ddd = when(day){
        1 -> "Mudir"
        2 -> "Departament rehberi"
        3 -> "Team Leader"
        4 -> "Senior"
        5 -> "Middle"
        6 -> "Junior"
        else -> "Hec biri"
    }


    println("Masin markasin daxil edin")
    var d = readln()
    var t = when(d){
        "Toyota" -> "toyota"
        "Audi" -> "audi"
        "BMW" -> "bmw"
        else -> "nissan"
    }
    println("$t markali masin satildi")
}
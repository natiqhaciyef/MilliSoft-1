package com.natiqhaciyef.millisoft_1.video

fun main() {
    // Riyazi -> +, -, *, /, %
    // Mentiqi -> &&, ||, !
    // Muqayise ->  <, >, >=, <= , ==, !=       Boolean

    // Riyazi operatorlar
    var a = 12
    var c = 100

    println(a + c)  // toplama      112
    println(c - a)  // cixma        88
    println(c * a)  // vurma        1200
    println(c / a)  // bolme        8
    println(c % a)  // qaliq almaq  100%12 = q4


    // Muqayise operatorlari
    var d = 112
    var b = 86

    println(d > b)
    println(d == b)
    println(d != b)


    // Mentiqi operatorlar
    var b1 = true
    var b2 = false

    println(b1 && b2)
    println(a > b || d < c || d > b)

    // && -> true + true = true
    // && -> true + false = false
    // && -> false + true = false
    // && -> false + false = false

    // || -> true + true = true
    // || -> false + true = true
    // || -> true + false = true
    // || -> false + false = false

    // ! -> false = true
    // ! -> true = false

    println(!b1)
    println(!(a > c))
}
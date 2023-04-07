package com.natiqhaciyef.millisoft_1.advanced

import java.lang.Exception

fun main() {
    // Nullable olan ve nullable olmayan
    var text = "2f"
    var a: Int? = null
//    var numberFormatException = NumberFormatException()

    // 1. let
    a?.let {
        println(a)
    }

    // 2. if - else
    if (a != null){
        println(a)
    }else{
        println("Null deyer")
    }

    // 3. Elvis operatoru
    println(a ?: 10)


    // try - catch (safe)
    try {
        println(text.toInt())
    }catch (e: Exception){      // Number format exception
        throw java.lang.NumberFormatException("Daxil edilen string xetalidir")
    }

    println("My name is Natiq")

    // try - catch - final
    try {
        println(text.toInt())
    }catch (e: Exception){
        throw java.lang.NumberFormatException("Daxil edilen string xetalidir")
    }finally {
        println("Text is $text")
    }

}
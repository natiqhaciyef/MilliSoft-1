package com.natiqhaciyef.millisoft_1.tapsiriq

fun main() {
    println("Red color: ${Color.RED.colorCode}")
    println("Green color: ${Color.GREEN.colorCode}")

    println(Audi.list)
    val audi = Audi("A8 Long",Color.GRAY)
    println(audi)
}

enum class Color(var colorCode: String){
    BLUE("#70a2d4"),
    GREEN("#17e364"),
    RED("#ff205c"),
    GRAY("#808080")
}

data class Audi(var name: String, var color: Color){
    companion object{
        val list = mutableListOf("RS 8","Q7","A4","A5","A8 Long")
    }
}


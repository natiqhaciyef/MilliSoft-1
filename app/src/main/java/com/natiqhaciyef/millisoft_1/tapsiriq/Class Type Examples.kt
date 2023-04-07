package com.natiqhaciyef.millisoft_1.tapsiriq

import com.natiqhaciyef.millisoft_1.oop.ResponsiveClass


fun main() {
    println("Red color: ${Color.RED.colorCode}")
    println("Green color: ${Color.GREEN.colorCode}")

    println(Audi.list)
    val audi = Audi("A8 Long",Color.GRAY)
    val audi2 = Audi("A8 Long",Color.GRAY)
    val audi3 = Audi("A8 Long",Color.GRAY)
    println(audi)

    val audi4 = audi.copy(name = "A6", color = Color.GREEN)
    println(audi4)
    println(AudiList.list.contains(audi.name))

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

object AudiList{
    val list = mutableListOf("RS 8","Q7","A4","A5","A8 Long")
}

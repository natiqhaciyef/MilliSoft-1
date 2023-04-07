package com.natiqhaciyef.millisoft_1

import com.natiqhaciyef.millisoft_1.tapsiriq.Car
import com.natiqhaciyef.millisoft_1.tapsiriq.User

data class Info(var title: String, var description: String)

fun main() {

    val eded = { a:Double, b: Double ->
        val c = a + b
        val d = (c - c.toInt()) //.toFloat()
        // 0.2456

        println(d)
        println("%.2f".format(d))
    }

    val eded2 : (Double, Double) -> Double = {a,b ->
        val c = a + b
        val d = (c - c.toInt()) //.toFloat()
        // 0.2456

        println("%.2f".format(d))
        d
    }

    eded.invoke(3.14,5.11231)
    println(eded.invoke(3.14,5.777))


    val list = mutableListOf(
        Info(title = "Title 1", description = "Description 1"),
        Info(title = "Title 2", description = "Description 2"),
        Info(title = "Title 3", description = "Description 3"),
        Info(title = "Title 4", description = "Description 4"),
        Info(title = "Title 5", description = "Description 5"),
        Info(title = "Title 6", description = "Description 6"),
        Info(title = "Title 7", description = "Description 7"),
    )

    val map = list.associateBy { info -> info.title}
    println(map)
}


package com.natiqhaciyef.millisoft_1.advanced

import com.natiqhaciyef.millisoft_1.tapsiriq.User

fun main() {
    // parametrsiz ve hec ne qaytarmayan
    val a: (String, String) -> Unit = { info, address ->
        println("Natiq lambda dersindedir")
    }
    println(a.invoke("", ""))

    var f = getInformationAddress("", "")

    // parametrli hec ne qaytarmayan
    val b: (String) -> Unit = {
        println(it.length)
    }
    b.invoke("Hello world!")

    val c: (String) -> Unit = { str ->
        println(str.length)
    }
    c.invoke("Hello world!")

    val d: (String, String) -> Unit = { a, b ->
        println("A is $a and B is $b")
    }
    d.invoke("First", "Second")

    var n = 12
    // parametrsiz geri qaytaran tip
    val e: () -> Int = {
        var x = "Natiq"
        println(x)
        n * n
    }
    println(e.invoke())

    // parametrli geri qaytaran
    val i: (Int, Int) -> Int = { a, i ->
        i * a
    }
    println(i.invoke(2, 7))


    // funksiyanin parametri kimi oturmek
    val x: (String) -> Unit = {
        println(it)
    }

    val address = "Ceyhun Hacibeyli kucesi"
    getAddress(address = address, proses = x)
    getAddress(address = "Ceyhun Hacibeyli kucesi", proses = {
        println(it.length)
    })

    getAddress(address = "Shemsi Rehimov kucesi") {
        println(it[0])          // anonim funksiya
    }


    val list = mutableListOf("n", "n", "i", "e", "l", "f", "c")
    println(list.filter { letter ->
        letter == "n"
    }.size)

    val j: String.() -> Double = {
        this.toInt().toDouble()
    }


    val numbers = mutableListOf<Int>(1, 2, 1, 4, 12, 94, 67, 37, 27, 29, 96, 71)
    val trophies = mutableListOf<Trophie>(
        Trophie(4, "UCL"),
        Trophie(2, "Super Cup"),
        Trophie(8, "La Liga"),
        Trophie(7, "European league")
    )

    println(
        trophies.associateBy { element ->
            element.name     // (value -> key)
        }
    )

}

fun getAddress(
    address: String,
    proses: (String) -> Unit = {
    println(it.length)
}
){
    when (address) {
        "Ceyhun Hacibeyli kucesi" -> {
            proses(address)
        }
        "Shemsi Rehimov kucesi" -> {
            proses(address)
        }
        "Albert Aqaronovkucesi" -> {
            proses(address)
        }
        else -> {
            println("$address is not required address")
        }
    }
}

data class Trophie(var a: Int, var name: String)


fun getInformationAddress(info: String, address: String): String {
    return "Info : $info , Address : $address"
}

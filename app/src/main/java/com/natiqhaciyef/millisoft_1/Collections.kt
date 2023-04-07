package com.natiqhaciyef.millisoft_1

fun main() {
    val list = listOf<String>("Toyota","Ford","Audi")
    println(list)
    println(list.size)
    println(list.get(2))
    println(list[1])

    val mList = mutableListOf<String>("Mercedes","BMW","Kia","Tesla")
    mList.add("Bentley")
//    mList.add(3,"Fiat")
    mList.addAll(list)
    println(mList)
    println(mList.removeAt(2))
    println(mList.remove("BMW"))
    println(mList)

    println(mList.reversed())
    mList.forEach {
        println(it)
    }

    for(i in mList.indices){
        println(i)
    }


    println("------------------")
    // Set
    val mSet = mutableSetOf<String>("Natiq","Ismayil","Esref","Eli","Faiq","Ismayil","Esref")
    println(mSet.size)

    println("------------------")
    // Map
    var map = mutableMapOf<String, String>("Key 1" to "Value 1", "Key 2" to "Value 2", "Key 3" to "Value 3")
    var pair = Pair<String, String>("Key 4","Value 4")
    map["Key4"] = "Value 4"
    println(map)
    println(map["Key 2"])
    println(map.keys)
    println(map.values)
}
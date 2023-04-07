package com.natiqhaciyef.millisoft_1.advanced


fun main() {
    var a: String? = null
    var f: Int? = null
    var list1: MutableList<String> = mutableListOf()
    var list2: MutableList<String?> = mutableListOf(null, "String")
    var list3: MutableList<String>? = null
    var list4: MutableList<String?>? = mutableListOf(null)


    a = "Native Development"
    // !! - men null olmadigindan eminem, xeta gelsede olar
    // check 1
    if (a != null) {
        printX(a!!)
        a = null
//        printX(a!!)
    }else {
        println("Check 1")
    }

    // check 2
    println(a ?: "Check 2")

    // check 3
    a?.let {
        println("Check 3 $it")
    }


    // !! - force check
    // ? - safe check
    println(a?.length)

    var host = Host(name = "Mahir", age = 26, driveLisence = null)
    var house = House(height = 6, width = 200, housePlace = "Bineqedi", host = host)

    println(house.host?.driveLisence)

    val list: List<Double?> =
        mutableListOf<Double?>(null, 3.14, 5.1, null, 7.3, null, null, 9.0, 11.2, 113.4)
//    Double? -> Double + null

    // checking null version 1
    val mList = list.toMutableSet()
    mList.remove(null)
    printX("$mList")


    // checking null version 2
    for (i in list) {
        if (i != null)
            println(i)
    }

    println("--------------")

    // checking null version 3
    list.forEach {
        it?.let { number ->
            println(number)
        }
    }

    // ?: checking null version 4
    val tempList = mutableListOf<Double>()
    for (i in list) {
        tempList.add(i ?: 0.0)
    }


    var host2: Host? = null         // Host? -> Host + null

    println(host2?.driveLisence)

    val houseN = House(
        5,
        7,
        "",
        null
    )

    println(houseN.host?.driveLisence)
    println(houseN.host!!.driveLisence)

    host2 = Host(name = "Host", age = 18, driveLisence = false)

    println(host2.driveLisence)

    // Coffee shop

    // min 2 - data class
    // min 1 - enum type
    // OOP butun xususiyyetleri tetbiq olunmalidir
    // Lambda expression tetbiq olunmalidir

    val nnn : ((String) -> Int)? = null
    val nnn2 : (String) -> Int? = {
        null
    }

}

fun getLambdas(
    usage: (String) -> Unit,
    content: (IntRange) -> Unit
) {

}

fun getLambda(
    name: String,
    usage: (String) -> Unit
) {

}


fun printX(x: String) {
    println(x)
}

data class House(
    var height: Int,
    var width: Int,
    var housePlace: String,
    var host: Host?
)

data class Host(
    var name: String,
    var age: Int,
    var driveLisence: Boolean?
)
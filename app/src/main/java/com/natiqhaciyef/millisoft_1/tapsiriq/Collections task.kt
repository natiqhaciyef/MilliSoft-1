package com.natiqhaciyef.millisoft_1.tapsiriq

fun main() {
    // Task 1
    var a = "Element"
    var b = ""
    // 1ci usul
    for (i in a.indices) {
        b += a[a.length - i - 1]   // t
    }
    println(b)

    var c = ""
    // 2ci usul
    for (i in a.length downTo 1) {
        c += a[i - 1]
    }
    println(c)

    var d = ""
    // 3cu usul
    for (i in a.indices) {
        d += "${a[a.length - i - 1]}"
    }
    println(d)


    // Task 2.1
    var number1 = 1223  // 1223
    var temp = 1223  // 1223
    var counter = 0
    while (temp > 0) {
        temp = (temp - (temp % 10)) / 10
        counter++
    }

    println(counter)

    var t = "$number1"
    var g = ""
    // Task 2.2
    for (i in 0 until counter) {
        g += t[t.length - 1 - i]
    }

    println(g)
    if (t == g) {
        println("Palindrome")
    } else {
        println("Not palindrome")
    }

    // Task 3
    var loopCounter = 6
    var loopCounter2 = 0
    var simvol = "*"
    while (loopCounter >= 0) {
        loopCounter2 = loopCounter
        while (0 < loopCounter2) {
            print(simvol)
            loopCounter2 -= 1
        }
        println()
        loopCounter -= 1
    }


    // Task 4
    var list = mutableListOf(5, 34, 86, 91, 6, 12, 3, 7, 8, 4, 22)
    var minimum = list[0]

    for (i in list) {
        if (minimum > i) {
            minimum = i
        }
    }

    println(minimum)


    var maximum = list[0]

    for (i in list) {
        if (maximum < i) {
            maximum = i
        }
    }

    println(maximum)

    // Task 5
    var tekList = mutableListOf<Int>()
    var cutList = mutableListOf<Int>()

    for (i in list) {
        if (i % 2 == 0)
            cutList.add(i)
        else
            tekList.add(i)
    }

    if (tekList.size > cutList.size)
        println("Teklerin sayi cutlerden coxdur")
    else if (tekList.size < cutList.size)
        println("Cutlerin sayi teklerden coxdur")
    else
        println("Beraberdir")


    // Task 6
    var sadeEdedList = mutableListOf<Int>()
    var counterN = 0
    for (i in 1..100){
        for (j in i downTo 1){
            if (i%j == 0)
                counterN += 1
        }
        if (counterN < 2)
            sadeEdedList.add(i)
        counterN = 0
    }

    println(sadeEdedList)
    println(sadeEdedList.size)
    task4()
    task6()
    task7()
    task8()
    task9()
}


fun task4(){
    val set = mutableSetOf<Char>('a','d','h','n','w','y','l','t','s','r')
    var list = mutableListOf<Char>()
    list = set.toMutableList()

    println(list[3])
    println(list[7])

    list.removeAt(3)
    list.removeAt(7)
    println(list)
}

fun task6(){
    val list = mutableListOf<String>("a","b","c","d","e","f")
    var temp = ""
    for (i in list){
        temp += i
    }
    println(temp)
}

fun task7(){
    val map = mutableMapOf<String,Any>(
        "ad" to "Natiq",
        "soyad" to "Haciyev",
        "yash" to 23,
    )
    println(map)
}

fun task8(){

}

fun task9(){
    println("Enter the number 1: ")
    var number1 = readln().toDouble()
    println("Enter the number 2: ")
    var number2 = readln().toDouble()

    println("Choose calculation operator: + - * /")
    var operator = readln()

    when(operator){
        "+" -> println(toplama(number1,number2))
        "-" -> println(cixma(number1,number2))
        "*" -> println(vurma(number1,number2))
        "/" -> println(bolme(number1,number2))
        else -> println("Bele bir operator yoxdur")
    }
}


fun toplama(number1: Double, number2: Double) = number1 + number2
fun cixma(number1: Double, number2: Double) = number1 - number2
fun vurma(number1: Double, number2: Double) = number1 * number2
fun bolme(number1: Double, number2: Double) = number1 / number2
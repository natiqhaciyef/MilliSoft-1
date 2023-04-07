package com.natiqhaciyef.millisoft_1.imtahan

import com.natiqhaciyef.millisoft_1.oop.abstraction.User
import com.natiqhaciyef.millisoft_1.sum

fun main() {
    var str = "Salam Menim Adim Ismayildir"
    var upLetter = str.toUpperCase()

    if (upLetter.length > 5) {
        println("paragraph")
    } else {
        println("Text")
    }

    println(sumNum(111))
    val toplama = sumNum(123) // 6
    println(toplama)

    println(findUpperCase(str))
    println(removeRepeatedNumbers(listOf(11, 23, 4, 72, 22, 11, 2, 11, 32)))
    println("------------")
    var userData = UserData("Natiq")
    userData.details = "Natiq "
    userData.details = "Haciyev"
    println(userData.details)

    val ll : Int.(String, Int) -> Int = { s, i ->
        s.length + i
    }

    val a = 5::toString
}

fun sumNum(say: Int): Int {
    var teklikler = say % 10
    var onluqlar = (say / 10) % 10
    var yuzlukler = say / 100


    return teklikler + onluqlar + yuzlukler
}

class UserData(var name: String){
    var details: String = ""
        set(value){
            field += value
        }
}


fun findUpperCase(str: String): Int{
    var counter = 0
    for (i in str){
        if (i in 'A'..'Z'){
            counter += 1
        }
    }
    return counter
}

fun removeRepeatedNumbers(list: List<Int>): Set<Int>{
    return list.toSet()
}

// Ismayil 1+ 2+ 3+ 4- 5- 6+ 7+ 8+ 9+ 10- 11+ 12+ 13+ 14+ 15+/- 16+ 17+ 18+ 19+ 20+ = 85%
// Esref 1+ 2+ 3+ 4- 5- 6- 7- 8+ 9+ 10+ 11+/- 12+ 13+ 14+ 15+/- 16- 17+ 18+ 19+ 20+ = 72%

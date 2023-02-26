package com.natiqhaciyef.millisoft_1.video

fun main() {
    var a = 19
    var b = 22
    var c = 24

    // if - else - else if
    // when - else

    if(a > b || c > b){
        println("$a $b den boyukdur")
    }else if(a == b) {
        println("$a $b e beraberdir")
    }else{
        println("$a $b den kicikdir")
    }

    var x = 0
    if (a > b){
        x = 12
    }else{
        x = 22
    }

    var y = if(a < c){
        "Ilk halimiz icra olundu"
    } else {
        "Ikinci hal icra olundu"
    }
    println(y)

    // when - else
    var day = 5
    when(day){
        1 -> { println("Bazar ertesi") }
        2 -> { println("Chersenbe axsami") }
        3 -> { println("Chersenbe") }
        4 -> { println("Cume axsami") }
        5 -> { println("Cume") }
        else -> { println("Deyer qebul edilmedi") }
    }

    day = 7
    var gunler = when(day){
        1 -> { "Bazar ertesi" }
        2 -> { "Chersenbe axsami" }
        3 -> { "Chersenbe" }
        4 -> { "Cume axsami" }
        5 -> { "Cume" }
        else -> { "Deyer qebul edilmedi" }
    }

    println(gunler)

}
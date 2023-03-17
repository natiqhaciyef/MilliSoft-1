package com.natiqhaciyef.millisoft_1.oop

import com.natiqhaciyef.millisoft_1.tapsiriq.User


class Car {
    // property
    var motor: Double = 0.0
    var name: String = ""
    var speed: Int = 0

    // field
    fun speedUp(s:Int = 10){
        speed += s
    }

    fun speedDown(s:Int = 10){
        speed -= s
    }
}

fun main() {
    var car1 = Car()
    car1.name = "Audi Q7"
    car1.speed = 40
    car1.speedUp(20)
    println(car1.speed)

    var car2 = Car()
    car2.name = "Mercedes"
    car2.speed = 30

    println(car1.speed)
    println(car2.speed)

    println(car1.name)
    println(car2.name)

    println(car1)
    println(car2)

    var user = User()
}


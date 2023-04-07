package com.natiqhaciyef.millisoft_1.oop.abstraction


// Not full abstract
abstract class Vehicle {
    var wheels = 4              // not abstract
    abstract var year: Int      // abstract

    abstract fun speedUp(s: Int)
    abstract fun speedDown(s: Int)
}


// Full abstract
interface VehicleMovement {
    var price: Int
    fun getBrandName(): String
    fun getPriceItem():Int
}

// inheritance yalniz 1 class ile olur. Child classin yalniz 1 Parenti olur
// interfaceler istenilen qeder ola biler
class Car(
    var brand: String,
    override var price: Int
) : Vehicle(), VehicleMovement {
    var speed = 20

    override var year: Int = 2018
    override fun speedUp(s: Int) {
        speed += s
    }

    override fun speedDown(s: Int) {
        if (speed > 0) {
            speed -= s
        }
    }

    override fun getBrandName(): String = brand
    override fun getPriceItem(): Int = price
}

class Bus(var brand: String) : Vehicle() {
    var speed = 10
    var wheelCount = super.wheels + 4

    override var year: Int = 2013

    override fun speedUp(s: Int) {
        speed += s
    }

    override fun speedDown(s: Int) {
        speed -= s
    }
}


fun main() {
    var car = Car("Audi", 35000)
    var bus = Bus("Daewo")
    println(car.year)
    println(car.speedUp(20))
    println(bus.speedUp(20))

    println(car.speed)
    println(bus.speed)
    println(car.getBrandName())
    println(car.getPriceItem())
}
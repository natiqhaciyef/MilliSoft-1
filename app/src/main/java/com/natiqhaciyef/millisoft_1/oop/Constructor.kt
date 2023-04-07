package com.natiqhaciyef.millisoft_1.oop

fun main() {
    val animal = Animal("Tiger",4)
    animal.getAnimalName()
    animal.name = ""

    val vehicle = Vehicle(6.5)
    vehicle.vehicleName = ""


    val math = Mathematics(mutableListOf(3,8,12,9))
    println(math.toplama())
    val math2 = Mathematics(12,44)
    println(math2.qaliq)
}

class Animal (
    var name:String,
    age: Int
){

    // Primary
    fun getAnimalName(){
        println("My animal's name is $name")
    }
}


// Secondary
class Vehicle{
    var vehicleName = ""
    var vehicleEngine = 0.0

    constructor(name: String): this(0.0){
        vehicleName = name
    }

    constructor(engine: Double){
        vehicleEngine = engine
    }

    fun getVehicleName(){
        println("Vehicle name is $vehicleName")
    }
}






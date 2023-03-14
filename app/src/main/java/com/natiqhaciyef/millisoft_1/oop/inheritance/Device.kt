package com.natiqhaciyef.millisoft_1.oop.inheritance

open class Device(
    var a:String
) {
    open var name: String = "Device is empty"

    open fun greeting(){
        println("I am Device")
    }
}

class Computer(a: String) : Device(a){
    override var name: String = "Computer"
    var name2 = super.name

    fun computerGreeting(){
        println("I am computer")
    }

    override fun greeting(){
        println("I am Computer")
    }
}

open class Phone(
    a: String
) : Device(a){

    override fun greeting() {
        println()
    }
}

class Xiaomi(
    a:String
) : Phone(a){
    var xiaomiName = this
    fun xiaomiGreeting(){
        println("I am xiaomi")
    }
}

fun main() {
    var device = Device("")
    var computer = Computer("")
    var phone = Phone("")
    var xiaomi = Xiaomi("")
    var a: Device = xiaomi
    var b: Phone = xiaomi
//    var d: Xiaomi = device
    println("Edited variable : ${a.name}")

    computer.computerGreeting()

    println(xiaomi.name)


    // Dynamic polymorphism (run-time) overload, 1 class icerisinde
    type("Natiq","Ismayil")
    type("Esref")

    // Static polymorphism (compile time) override, istenilen qeder tetbiq oluna bilir
    computer.greeting()
    println(computer.name)
    println(computer)
}

fun type(name: String){
    println(name)
}

fun type(a: String, b: String){
    println(a)
}


package com.natiqhaciyef.millisoft_1.tapsiriq

abstract class Phone{
    abstract fun setPhoneNumber(number: String)
    fun getPhoneType(){
        println("Non-phone selected")
    }
}


class Xiaomi : Phone(){
    var number: String = ""
        get() = ""
        set(value) { field = value }

    override fun setPhoneNumber(number: String) {
        this.number = number
        println("Number is ${this.number}")
    }
}

fun main() {
    val xiaomi = Xiaomi()
//    xiaomi.number = "+994 55 333 22 44"
//    println(xiaomi.number)
    xiaomi.setPhoneNumber("+994 55 333 22 44")
}


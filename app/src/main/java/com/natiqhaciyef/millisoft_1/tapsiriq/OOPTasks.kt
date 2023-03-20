package com.natiqhaciyef.millisoft_1.tapsiriq

open class User{
    var name: String = ""
        get() = field
        set(value){ field += value }
}

class Admin: User(){
    val n = super.name
}

abstract class EngineVol{
    abstract var engine: Double

    abstract fun getVol()
    abstract fun getName()

    var maxEngine = 7.6
}

open class Car(override var engine: Double, override var name: String) : EngineVol(), CarBehaviour{
    override fun getVol() {
        TODO("Not yet implemented")
    }

    override fun getName() {
        TODO("Not yet implemented")
    }

    override var speed: Double = 0.0
        get() = field
        set(value) { field = value}

    override fun speedUp(i: Int) {
        TODO("Not yet implemented")
    }

    override fun speedDown(i: Int) {
        TODO("Not yet implemented")
    }
}

interface CarBehaviour{
    var name: String
    var speed: Double
    fun speedUp(i: Int)
    fun speedDown(i: Int)
}

fun main() {
    val user = User()
    val admin = Admin()
    admin.n
    user.name = "Natiq"
    user.name = " Haciyev"
    println(user.name)

    val car = Car(5.6, "BMW")
    println(car.maxEngine)

}


class MyNumber(): Number(){
    override fun toByte(): Byte {
        TODO("Not yet implemented")
    }

    override fun toChar(): Char {
        TODO("Not yet implemented")
    }

    override fun toDouble(): Double {
        TODO("Not yet implemented")
    }

    override fun toFloat(): Float {
        TODO("Not yet implemented")
    }

    override fun toInt(): Int {
        TODO("Not yet implemented")
    }

    override fun toLong(): Long {
        TODO("Not yet implemented")
    }

    override fun toShort(): Short {
        TODO("Not yet implemented")
    }
}
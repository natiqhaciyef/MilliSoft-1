package com.natiqhaciyef.millisoft_1.oop

class Mathematics(
    val list: MutableList<Int> = mutableListOf()
){
    var qaliq = 0
    fun toplama(): Int{
        var a = 0
        list.forEach { a += it }
        return a
    }

    fun cixma(): Int{
        var a = 0
        list.forEach { a -= it }
        return a
    }

    fun vurma(): Int{
        var a = 0
        list.forEach { a *= it }
        return a
    }

    fun bolme(): Double{
        var a = 0.0
        list.forEach { a /= it }
        return a
    }

    constructor(a:Int, b:Int): this(mutableListOf(3,4,7)){
        qaliq = a%b
    }

    override fun toString(): String {
        return super.toString()
    }
}



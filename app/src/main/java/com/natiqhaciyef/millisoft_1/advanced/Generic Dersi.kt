package com.natiqhaciyef.millisoft_1.advanced


fun main() {
    // Tipini onceden bilmediyimiz ve ya umumilesdirmek ucun istifade elediyimiz
    val eded: Double = 0.0
    // T type

    getData<String>("Natiq")
    getData<Double>(0.0)


    vurma<MyInt>(MyInt(), MyInt())

    val a = mutableMapOf<String, String>()
    val x = MyData<Double>(7.2)

    val genericTester = GenericTester<String, Int, Double>("username", 14, 9.7)
    println(genericTester.getFirstGeneric())
    println(genericTester.getSecondGeneric())
    println(genericTester.getThirdGeneric())
}


abstract class GenericImplementerOut < out T, out R, out N> {
    abstract fun returnDataT(): T
    abstract fun returnDataR(): R
    abstract fun returnDataN(): N
    abstract fun setDataU(): N
}


abstract class GenericImplementerIn < in T,  R, in N> {
    abstract fun returnDataT(data: T)
    abstract fun returnDataR(data: R): R
    abstract fun returnDataN(data: N)
}


class GenericTester<N, H, R>(
    var dataN: N,
    var dataH: H,
    var dataR: R
) {

    fun getFirstGeneric(): N {
        return dataN
    }

    fun getSecondGeneric(): H {
        return dataH
    }

    fun getThirdGeneric(): R {
        return dataR
    }
}


fun <T> getData(data: T) {
    println(data)
}

fun <T : MyNumber> vurma(data1: T, data2: T) {
    println(data1)
    println(data2)
}


// number -> double, int,
open class MyNumber {
    fun vurma(data1: MyNumber, data2: MyNumber) {
        println(data1)
        println(data2)
    }
}

class MyDouble : MyNumber() {
    fun getData() {
//        super.vurma()
    }
}

class MyInt : MyNumber() {

}

class MyData<T>(
    var data: T
) {

    fun getData1(): T {
        return data
    }

    fun setData2() {
        val a = mutableListOf<T>()
    }
}
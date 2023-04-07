package com.natiqhaciyef.millisoft_1.advanced.kotlinsecurity

import android.util.Log
import java.io.IOException

fun main() {
    // Loglamaq - prosesin merhelelerini izlemek
    val list = mutableListOf(1,10,9,28,17,49,56,34)
    for (i in list){
        Log.d("MYTAG", "$i")
    }
}


fun throwOwnException(){
    println("Istifadeci adini daxil edin : ")
    var deyer2 = readln()

    if (deyer2 == "Natiq"){
        println("Admin paneline xos geldiniz")
    }else{
        throw IOException("Istifadeci admin panele daxil ola bilmez")
    }
}
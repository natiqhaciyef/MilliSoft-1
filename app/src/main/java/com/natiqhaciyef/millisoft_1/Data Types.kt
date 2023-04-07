package com.natiqhaciyef.millisoft_1

import java.text.SimpleDateFormat
import java.util.*


fun main() {
    val a = 23      //  Int
    val d = 22.0    //  Double
    val s = "Flutter Kotline cataa bilmez"  // String
    val b = true    // Boolean
    val c = '/'     // Char
    val intRange = 1 until 10   // Int Range
    val charRange = '/'..'z'    // Char Range
//    dateTime()
    val l = 22.0
    createDate()

    var name = "Natiq"
    println(name)

    println("Menim adim $name'dir")
    println("Menim deyisenlerimin cemi : ${a + d}")


    println("------------------------")
    println("Adinizi daxil edin")
    val name2 = readln()
    println("Yashinizi daxil edin")
    val age2 = Integer.parseInt(readln())
    println("Sizin adiniz $name2'dir ve yasiniz $age2'dir")



}


//fun dateTime(){
//    val date = Calendar.getInstance().time
//    val sdf = SimpleDateFormat("dd.MM.yyyy")
//    val formatedDate = sdf.format(date)
//
//    println(formatedDate)
//}


// Date type
fun createDate(){
    val calendar = Calendar.getInstance().time
    val sdf = SimpleDateFormat("dd.MM")
    println(sdf.format(calendar))
}



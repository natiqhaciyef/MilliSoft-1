package com.natiqhaciyef.millisoft_1.advanced

import java.util.regex.Pattern


// [A-Za-z] - a dan z hem boyuk hem kicik elementleri ifade edir
// [@] - 1 @ isaresi istifade oluna biler
// {8} - minimum sayi

val REG = "^(\\d{9}\$)"
val REG2 = "^[A-Ba-b](.*)([@]{1})"
val REG3 = "^[A-Za-z\\d]{8}(.*)"


var PATTERN: Pattern = Pattern.compile(REG)
var PATTERN2: Pattern = Pattern.compile(REG2)
var PATTERN3: Pattern = Pattern.compile(REG3)

fun main() {
//    Regex
//    println("Enter the phone number")
//    var phone = readln()
//    println(isPhoneNumber(phone))

    println("Enter the user info")
    var password = readln()
    println(PATTERN3.matcher(password).find())

}

fun isPhoneNumber(phone:String) : Boolean = PATTERN.matcher(phone).find()
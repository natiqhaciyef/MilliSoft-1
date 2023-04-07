package com.natiqhaciyef.millisoft_1.advanced

import com.natiqhaciyef.millisoft_1.oop.abstraction.Admin
import com.natiqhaciyef.millisoft_1.oop.abstraction.Person
import com.natiqhaciyef.millisoft_1.oop.abstraction.User

var String.age : Int
    get() = settedAge
    set(value) {
        settedAge = value
    }

var settedAge = 0

fun main() {
    var a = "Natiq"
    var b: String = "Nurlan"
    println(a)
    println(a.myFunction())
    println(b.myFunction())

    println("---------------")
    "jdisfibsj".age = 66
    println(a.age)
    println("---------------")

    var i = 12
    println(i.getSquare())
    println(i)

    var h = 10
    h.multiplyWith(30)

    var p = Person(email = "natiq@gmail.com", password = "12345",a = "Default info")
    p.getUserName()

    var admin = Admin(email = "admin@gmail.com", password = "12345")
    admin.getUserName()
    p.getA()

    var age = 3
    age::toString
}


fun String.myFunction(): Boolean{
    return this.contains("i")
}

fun Int.getSquare(): Int{
    return this * this
}

fun Int.multiplyWith(a:Int){
    println(this * a)
}

fun User.getUserName(){
    println(this.email)
    println(this.password)
}

fun Person.getA(): String{
    return this.a
}
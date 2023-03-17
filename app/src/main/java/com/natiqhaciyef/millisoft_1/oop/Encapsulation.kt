package com.natiqhaciyef.millisoft_1.oop

private open class User{    // eyni file daxilinde
    // Access modifier

    // private
    // protected
    // internal - default
    // public

    var a: String = "A"     // public - her yerde cagirila bilir
    internal var b : String = "B"   // internal - eyni module daxilinde
    protected var c : String = "C"  // protected - inherit elediyi (subclass) ve oz daxilinde
    private var d: String = "D"     // private - yalniz oz daxilinde cagirila bilir

    fun x(){ println("X") }
    internal fun y(){ println("Y") }
    protected fun z(){ println("Z") }
    private fun n(){ println("N") }

    var name: String = "Natiq"
        get() = field
        set(value) {
            field += value
        }

    var password: String = "****"
        get() = "Empty Password"
        set(value) {
            field = value
        }
}

private class Admin : User(){
    var aa = super.c
    fun getAllFunctions(){
        super.x()
        super.y()
        super.z()

        super.name = " Samir oglu"
        println(super.name)
    }
}


fun main() {
    val user = User()
    val admin = Admin()
    user.a
    user.b
    admin.aa    // c

    user.name = " Haciyev"
    println(user.name)

    admin.getAllFunctions()

    user.password = "Natiq123"
    println(user.password)
}
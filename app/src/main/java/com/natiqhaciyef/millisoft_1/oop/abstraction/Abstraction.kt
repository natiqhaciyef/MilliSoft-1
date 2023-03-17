package com.natiqhaciyef.millisoft_1.oop.abstraction

import com.natiqhaciyef.millisoft_1.tapsiriq.Car

// not full abstracted
abstract class User{
    abstract var email: String
    abstract var password: String
    fun gmailRegistration(){
        println("Email user daxilinde")
    }
}

// full abstracted
interface UserBehaviour{
    fun getEmail()
    fun getPassword()
}

// full abstracted
interface PersonBehaviour{
    var a: String
    fun getEmailPerson()
    fun getPasswordPerson()
}

class Person(override var email: String,
             override var password: String,
             override var a: String
) : User(), UserBehaviour, PersonBehaviour {

                 fun gmailRegister(){
                     super.gmailRegistration()
                 }

    override fun getEmail() {
        println("@gmail.com")
    }

    override fun getPassword() {
        TODO("Not yet implemented")
    }

    override fun getEmailPerson() {
        TODO("Not yet implemented")
    }

    override fun getPasswordPerson() {
        TODO("Not yet implemented")
    }
}

class Admin(override var email: String,
            override var password: String) : User(){
}

// Abstract class ve Interface
// Her ikisi abstract property ve fildler ucundur
// Hec birinin obyektini yaratmaq
// abstract olan funksionalliqlari implementasiya mecburdu

// Classlar yalniz 1 defe inherit olur, 1den cox interface implementasiyasi mumkundur
// Diger ferqleri constructor ferqi
// Diger ferq abstract classlarin tamamile abstract olmamasidir.
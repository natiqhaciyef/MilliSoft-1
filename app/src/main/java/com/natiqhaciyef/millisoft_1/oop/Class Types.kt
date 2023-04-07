package com.natiqhaciyef.millisoft_1.oop

import android.provider.ContactsContract.CommonDataKinds.Im
import com.natiqhaciyef.millisoft_1.tapsiriq.Color


fun main() {
    var adminPanel = AdminPanel(age = 23, name = "Natiq")
    var userPanel = UserPanel("Sadiq",15)

    Image.imageHeight = 200
    Image.imageWidth = 200
    Image.imageResource = "Drawable files"
    var i = Image

    println(i.imageHeight)
    println(adminPanel)
    println(userPanel)
    println(adminPanel.component1())

    println(UserPanel.userIP)
    println(userPanel.getUserData())

    val color = Colors.GRAY
    println(color.name)
    println(color.ordinal)
    println(color.declaringClass)
    println(color.colorCode)
    println(color.getColorCode1())

    when(color){
        Colors.WHITE -> println("White")
        Colors.BLACK -> println("Black")
        Colors.GRAY -> println("Gray")
        else -> println("Color not found")
    }

    println("-------------------")
    getResponse(ResponsiveClass.Success())
}

fun getResponse(responseResult: ResponsiveClass){
    when(responseResult){
        is ResponsiveClass.Error -> println("Error")
        is ResponsiveClass.Success -> {responseResult.sendMessage("data successfully sended")}
        is ResponsiveClass.Loading -> println("Loading")
    }
}


// data class
// sealed class
// enum class
// singleton
// inner class


// Data class - I/O proses ucundur. Data classlarin sub classi olmur
data class AdminPanel(
    var name: String,
    var age: Int
): Panel()

open class Panel



//Singleton - 1 instance olan classlardir.
object Image{
    var imageWidth = 0
    var imageHeight = 0
    var imageResource = ""
}


// Static property
class UserPanel(
    var name: String,
    var age: Int
): Panel(){

    // Default Instance
    companion object{
        var userInput = "User not found"
        var userIP = "194.255.0.0"
    }


    inner class UserData{
        fun getData() = "$name $age $userIP"
    }

    fun getUserData() {
        var userData = UserData()
        println(userData.getData())
    }
}


// Enum class
enum class Colors(var colorCode: String){
    WHITE("#FFFFFF") {
        override fun getColorCode1() = colorCode
    },
    BLACK("#000000") {
        override fun getColorCode1(): String = colorCode
    },
    GRAY("#808080") {
        override fun getColorCode1(): String = colorCode
    };

    abstract fun getColorCode1(): String
}


// Sealed class
sealed class ResponsiveClass(var param: String){
    class Success : ResponsiveClass(""){
        fun sendMessage(message: String){
            println("Success $message")
        }
    }
    class Error: ResponsiveClass("")
    object Loading: ResponsiveClass("")

}


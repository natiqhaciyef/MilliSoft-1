package com.natiqhaciyef.millisoft_1.tapsiriq.coffeeshop

import com.natiqhaciyef.millisoft_1.tapsiriq.User

fun main() {

    val list = mutableListOf<String>()
    for (element in Categories.categoryList){
        list.add(element.name)
    }
    println(list)

//    val nameList = Categories.categoryList.associateBy { category ->
//        category.name
//    }

    val data = readln().lowercase() // Deserts -> deserts
    if (list.contains(data))
        println("True")
    else
        println("False")

    when(data){
        "coffee" -> {}
    }

    while (true){
//        register -> username, email ve password  -> User("Natiq","natiq@gmail.com","natiq123")
//        login -> email ve password -> access true


    }
}
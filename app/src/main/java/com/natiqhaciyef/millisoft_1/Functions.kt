package com.natiqhaciyef.millisoft_1

fun main() {
    firstUnitFunction()
//    firstReturnableFunction()
    println(firstReturnableFunction())
    firstParameter(b = 2, a = 3.2)
    var a = firstParameter2(b = 2.0, a = 3.2)   // 5.2 -> 5
    println(a)

    println("--------------------")
    getUserName("Natiq")
    getUserAge(23)
    getUserAge(age = 23)
    println(getUserNameList(mutableListOf("Natiq", "Ismayil", "Esref")))

    println("--------------------")
    val array = arrayOf("Aze", "Tr", "Ru", "US", "UK", "Jap")
    getParameters(*array)

    println("-----------------------")
    var n = faktorial(5)
    println(n)
}

// Funksiya 1
fun printMyName() {
    var a = 1
    var b = 12 + a
    println("My name is Natiq")
}

// Deyer geri qaytaran ve qaytarmayan
// Deyer geri qaytarmayan
fun firstUnitFunction() {
    var a = 12
    var b = 34
    println(a * a + b)
}

// Deyer geri qaytaran
fun firstReturnableFunction(): String {
    var a = 18
    var b = 30

    println("Answer 2")
    return "My name is natiq and I calculate it : ${a * b}"
}

// Parametrsiz
fun firstWithoutParameter() {
    println("How are you")
}

//Parametrli
fun firstParameter(a: Double, b: Int) {
    println(a + b)
}

//Parametrli
fun firstParameter2(a: Double, b: Double): Int {
    return (a + b).toInt()
}

//Parametrlerin default
fun getUserName(name: String) {
    println("My name is $name")
}


//Parametrlerin default
fun getUserAge(age: Int = 18, name: String = "Ismayil") {
    println("$age")
}

fun getUserNameList(list: MutableList<String>): MutableList<String> {
    list.removeAt(1)
    return list
}

// varargs
fun getParameters(vararg a: String) {
    println(a.size)
    println(a[0])
}

fun testExpression(b: Int) {
    var a = if (12 > b)
        "Boyuk"
    else
        "Boyuk deyil"
}


// Single-Line expression
fun sum(a: Int, b: Int) = a + b


// Inline notation
inline fun multiplyNumbers(a: Int, b: Int): Int {
    return a * b
}

// Rekursiya
fun faktorial(a: Int): Int {
    var b = if (a > 0)
        a * faktorial(a - 1)
    else
        1
    return b
}
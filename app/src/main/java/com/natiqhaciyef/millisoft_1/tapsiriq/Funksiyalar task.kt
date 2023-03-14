package com.natiqhaciyef.millisoft_1.tapsiriq

fun main() {
    val list = mutableListOf(33, 33, 3, 60, 23, 13, 3, 2, 6)
    println(filterBy3(list))
    filterBy3Fun2(list)
    println(firstSum(45, mutableListOf(2,7,25,77,8)))
    function1('P')
}

fun filterBy3(list: MutableList<Int>): MutableSet<Int> {
    val filteredList = mutableListOf<Int>()

    for (i in list) {
        if (i % 3 == 0) {
            filteredList.add(i)
        }
    }

    return filteredList.toMutableSet()
}

fun filterBy3Fun2(list: MutableList<Int>) {
    val filteredList = mutableListOf<Int>()
    val temp = mutableListOf<Int>()

    for (i in list) {
        if (i % 3 == 0) {
            filteredList.add(i)
        }
    }

    for (i in list) {
        if (!temp.contains(i)) {
            temp.add(i)
        }
    }

    println(temp)
}

fun firstSum(a:Int, list:MutableList<Int>): Boolean{
    var c = 0
    var n = a

    while (n > 0){
        c += n%10       // c = 5
        n -= (n%10)     // 25 - 5 = 20
        n /= 10         // 20 / 10 = 2
    }

    return list.contains(c)
}


fun function1(char:Char){
    val list = function2(mutableListOf("Alma","Banan","Car","Device","Egypt","Figma"))

    val firstLetter = mutableListOf<Char>()

    for (i in list){
        firstLetter.add(i[0])
    }

    println(firstLetter.contains(char))
}

fun function2(list:MutableList<String> =
                  mutableListOf("Alma","Banan","Car","Device","Egypt","Figma")): MutableList<String>{
    return list
}

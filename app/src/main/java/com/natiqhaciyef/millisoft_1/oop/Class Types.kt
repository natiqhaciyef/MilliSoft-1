package com.natiqhaciyef.millisoft_1.oop

fun main() {
    val worker = Worker("Natiq", 23)
    val workerProfession = worker.WorkerProfession("Software Engineer")
    println(workerProfession)

    val developer = Developer(name = "Ismayil",field = "Android Developer")
    println(developer)
    println(developer.component1())

    val worker2 = Worker("Esref",19)
    val worker3 = Worker("Ismayil",19)

    Employee.name = "Natiq"
    val employee = Employee
    println(employee)


    var employer = Employer("","")
    println(Employer.infoDefault)
    println(employer.information)

    var sealedObj = ResponseHandling.Success("user info","success")
    println(sealedObj.data)

    fun setResponse(reponse:ResponseHandling) = when(reponse){
        is ResponseHandling.Success -> println("Success")
        is ResponseHandling.Error -> println("Error")
        is ResponseHandling.Loading -> println("Loading")
    }

    val s = "summer"
    var f = when(s){
        Seasons.SPRING.name.lowercase() -> "Mart, Aprel, May"
        Seasons.SUMMER.name.lowercase() -> "June, July, August"
        Seasons.AUTUMN.name.lowercase() -> "September, October, November"
        else -> "Winter"
    }

    println(f)
}

open class Employer(
    info: String,
    department: String
){
    // property
    var information = "Infomration selected"

    constructor() : this("","")
    constructor(info: String): this ("",""){
        information = info
    }

    // field
    fun getEmployerInfo() = information

    companion object{
        var userName = "Natiq"
        var infoDefault = "User info"
    }
}


// I/O - data class
data class Developer(
    var name: String,       // component 1
    var field: String       // component 2
): Employer(info = "$name $field", department = "IT department")


// Inner class
class Worker(var name: String, var age: Int){

    inner class WorkerProfession(var field: String)

    fun getWorkerProfession() = WorkerProfession("IT")
}

// Singleton
object Employee {
    var name: String = ""
    var age: Int = 0
}

// Sealed
sealed class ResponseHandling(
    var response: String
){
    data class Success(var data: String, var responseInfo: String) : ResponseHandling(responseInfo)
    data class Error(var errorMessage: String, var responseInfo: String) : ResponseHandling(responseInfo)
    object Loading: ResponseHandling("")
}

// Enum
enum class Seasons{
    WINTER {
        override fun getSeason() {

        }
    },
    AUTUMN {
        override fun getSeason() {

        }
    },
    SPRING {
        override fun getSeason() {

        }
    },
    SUMMER {
        override fun getSeason() {

        }
    };

    abstract fun getSeason()
}


enum class Response(msg: String){
    SUCCESS("Success message"),
    ERROR("Error message"),
    LOADING("Loading message")
}
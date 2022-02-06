package com.sansoft.collections

fun main() {
    val joao = Employee("João Fon", 1000.0, "CLT")
    val ashley = Employee("Ashley Muntai", 3500.0, "PJ")
    val thor = Employee("Thor Adinho", 2500.0,"CLT")

    println("------------LIST--------------")
    val employee = mutableListOf(joao, ashley)
    employee.forEach{ println(it) }

    println("----------------------")
    employee.add(thor)
    employee.forEach{ println(it) }

    println("----------------------")
    employee.remove(thor)
    employee.forEach{ println(it) }

    println("------------SET--------------")
    val employeeSet = mutableSetOf(joao)
    employeeSet.forEach{println(it)}

    println("----------------------")
    employeeSet.add(thor)
    employeeSet.add(ashley)
    employeeSet.forEach{println(it)}

    println("----------------------")
    employeeSet.remove(ashley)
    employeeSet.forEach{println(it)}

}
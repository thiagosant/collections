package com.sansoft.collections

fun main() {
    val joao = Employee("João Fon", 1000.0)
    val ashley = Employee("Ashley Muntai", 3000.0)
    val Thor = Employee("Thor Adinho", 2000.0)

    val employees = listOf(joao, ashley, Thor)

    employees.forEach{ println(it) }

    println("-------------------------")
    println(employees.find { it.name == "Ashley Muntai" })
}

data class Employee(
    val name: String,
    val salary: Double
){
    override fun toString(): String = "" +
            "\nName: $name" +
            "\nSalary: $salary" +
             "".trimIndent()
}
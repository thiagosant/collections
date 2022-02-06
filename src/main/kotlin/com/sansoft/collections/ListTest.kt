package com.sansoft.collections

fun main() {
    val joao = Employee("João Fon", 1000.0, "CLT")
    val ashley = Employee("Ashley Muntai", 3500.0, "PJ")
    val thor = Employee("Thor Adinho", 2500.0,"CLT")

    val employees = listOf(joao, ashley, thor)

    employees.forEach{ println(it) }

    println("-------------------------")
    println(employees.find { it.name == "Ashley Muntai" })

    println("-------------------------")
    employees
        .sortedBy { it.salary }
        .forEach{ println(it) }

    println("-------------------------")
    employees
        .groupBy { it.contractType }
        .forEach{ println(it) }
}

data class Employee(
    val name: String,
    val salary: Double,
    val contractType: String
){
    override fun toString(): String = "" +
            "\nName: $name" +
            "\nSalary: $salary" +
             "".trimIndent()
}
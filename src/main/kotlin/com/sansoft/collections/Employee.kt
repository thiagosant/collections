package com.sansoft.collections

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

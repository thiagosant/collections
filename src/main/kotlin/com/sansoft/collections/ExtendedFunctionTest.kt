package com.sansoft.collections

fun main() {
    val salary = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("------------------")
    println(salary.sum())

    println("------------------")
    println(salary.average())
}
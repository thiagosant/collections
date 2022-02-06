package com.sansoft.collections

fun main() {
    val salary = doubleArrayOf(14000.0, 2000.0, 5555.99, 1500.0)

    for (wage in salary) {
        println(wage)
    }

    println("****************************")

    println("Larger Wage: ${salary.maxOrNull()}")
    println("Lower Wage: ${salary.minOrNull()}")
    println("Average Wage: ${salary.average()}")

    println("****************************")

    val salaryLargerThem2500 = salary.filter { it > 2500 }
    salaryLargerThem2500.forEach { println(it) }
}
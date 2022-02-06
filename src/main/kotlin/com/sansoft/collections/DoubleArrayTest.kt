package com.sansoft.collections

fun main() {
    val salary = DoubleArray(3)

    salary[0] = 1000.00
    salary[1] = 4000.00
    salary[2] = 2000.00

    salary.forEach { println(it) }

    println("**************")

    salary.forEachIndexed { index, wage ->
        salary[index] = wage * 1.1
    }

    salary.forEach { println(it) }

    println("*****************")

    val salary2 = doubleArrayOf(1500.0, 5000.0, 2500.0)

    salary2.sort()
    salary2.forEach { println(it) }
}
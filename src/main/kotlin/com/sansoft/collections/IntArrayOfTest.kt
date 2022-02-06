package com.sansoft.collections

fun main() {
    val values = intArrayOf(2, 3, 10, 8, 9, 20)

    values.forEach {
        println(it)
    }

    println("------------------------")

    values.sort()
    values.forEach {
        println(it)
    }
}
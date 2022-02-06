package com.sansoft.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 4
    values[2] = 5
    values[3] = 7
    values[4] = 3

    for (value in values){
        println(value)
    }

    println("")

    values.forEach { value ->
        println(value)
    }

    println("")

    values.sort()
    for (index in values) {
        println(index)
    }

    println("")

    values.sortDescending()
    for (index in values) {
        println(index)
    }


}
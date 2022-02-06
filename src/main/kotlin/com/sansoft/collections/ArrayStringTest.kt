package com.sansoft.collections

fun main() {
    val names = Array(3){""}

    names[0] = "Maria"
    names[1] = "Jorge"
    names[2] = "Ashley"

    for (name in names) {
        println(name)
    }

    println("*****************")

    names.sort()
    names.forEach {
        println(it)
    }

    val names2 = arrayOf("Myra", "Ashley", "Giovanna")

    println("*****************")

    names2.sort()
    names2.forEach {
        println(it)
    }
}
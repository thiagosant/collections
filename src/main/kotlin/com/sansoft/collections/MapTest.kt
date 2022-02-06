package com.sansoft.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Key: $k - Value: $v") }

    val map2 = mapOf(
        "Pedro" to  2500.0,
        "Ashley" to 3000.0
    )

    map2.forEach { (k, v) -> println("Key: $k - Value: $v") }
}
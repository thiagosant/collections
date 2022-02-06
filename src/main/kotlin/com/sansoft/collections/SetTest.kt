package com.sansoft.collections

fun main() {
    val joao = Employee("João Fon", 1000.0, "CLT")
    val ashley = Employee("Ashley Muntai", 3500.0, "PJ")
    val thor = Employee("Thor Adinho", 2500.0,"CLT")

    val employee1 = setOf(joao, ashley)
    val employee2 = setOf(thor)

    val resultUnion =  employee1.union(employee2)
    resultUnion.forEach{ println(it) }

    println("------------------------")

    val employee3 = setOf(joao, ashley, thor)
    val resultSubtract = employee3.subtract(employee2)
    resultSubtract.forEach{ println(it) }

    println("------------------------")

    val resultIntersect = employee3.intersect(employee2)
    resultIntersect.forEach{ println(it) }

}
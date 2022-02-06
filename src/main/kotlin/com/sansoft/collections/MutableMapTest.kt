package com.sansoft.collections

fun main() {
    val joao = Employee("João Fon", 1000.0, "CLT")
    val ashley = Employee("Ashley Muntai", 3500.0, "PJ")
    val thor = Employee("Thor Adinho", 2500.0,"CLT")

    val repository = Repository<Employee>()

    repository.create(joao.name, joao)
    repository.create(ashley.name, ashley)
    repository.create(thor.name, thor)

    println(repository.findById(ashley.name))

    println("-------------------")
    repository.findAll().forEach{ println(it) }

    println("-------------------")
    repository.remove(ashley.name)
    repository.findAll().forEach{ println(it) }
}
package com.hopecoding.dependencyinjection

class Engine{
    fun start(){
        println("start engine")
    }
}


class Car{
    private val engine:Engine = Engine() // Tightly Coupling vardır burada. Car classı Engine Classına Bağımlı.

    fun start(){
        engine.start()
    }
}


fun main(){
    val car = Car()
    car.start()
}
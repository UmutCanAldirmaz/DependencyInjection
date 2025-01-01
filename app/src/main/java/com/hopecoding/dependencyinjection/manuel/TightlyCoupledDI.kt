package com.hopecoding.dependencyinjection.manuel

class Engine {
    fun start() {
    }
}

class Car() {
    private val engine = Engine()

    fun start() {
        engine.start()
    }

}


fun main() {
    val car = Car()
    car.start()
}
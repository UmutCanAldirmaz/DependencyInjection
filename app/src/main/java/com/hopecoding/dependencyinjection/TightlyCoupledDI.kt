package com.hopecoding.dependencyinjection

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
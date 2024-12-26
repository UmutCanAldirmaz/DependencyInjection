package com.hopecoding.dependencyinjection

interface Engine3{
    fun start()
}

class GasEngine3():Engine3{
    override fun start() {
        println("Gas Engine Started")
    }

}

class HybridEngine3():Engine3{
    override fun start() {
        println("Hybrid Engine Started")
    }

}

class ElectricEngine3():Engine3{
    override fun start() {
        println("Electric Engine Started")
    }
}

class QuantumEngine():Engine3{
    override fun start() {
        println("Electric Engine Started")
    }
}

// Constructor Inject Olarak kullanılır.
class Car3(private val engine:Engine3){
    fun start(){
        engine.start()
    }
}

class Plane(){
    private lateinit var engine:Engine3

    //Field & Setter Inject Denir.
    fun setEngine(engine: Engine3){
        this.engine = engine
    }
    fun start(){
        engine.start()
    }
}

fun main(){
    val plane = Plane()
    val quantumEngine = QuantumEngine()
    plane.setEngine(quantumEngine)
    plane.start()
}
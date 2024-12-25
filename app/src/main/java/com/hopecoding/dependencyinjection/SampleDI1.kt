package com.hopecoding.dependencyinjection

interface Engine{
    fun start()
}

class GasEngine():Engine{
    override fun start() {
        println("Gas Engine Started")
    }

}

class HybridEngine():Engine{
    override fun start() {
        println("Hybrid Engine Started")
    }

}

class ElectricEngine():Engine{
    override fun start() {
        println("Electric Engine Started")
    }

}

class Car(val engineType:EngineType){
    /* private val engine:Engine = Engine() // Tightly Coupling vardır burada. Car classı Engine Classına Bağımlı.
    fun start(){
        engine.start()
    }
     */

    private val gasEngine:GasEngine = GasEngine()
    private val hybridEngine:HybridEngine = HybridEngine()
    private val electricEngine:ElectricEngine = ElectricEngine()

    fun start(){
       when(engineType){
           EngineType.ELECTRIC -> electricEngine.start()
           EngineType.GAS -> gasEngine.start()
           EngineType.HYBRID -> hybridEngine.start()
       }
    }

}

enum class EngineType{
    GAS,ELECTRIC,HYBRID
}


fun main(){
    val car = Car(EngineType.ELECTRIC)
    car.start()

    val car2 = Car(EngineType.GAS)
    car.start()

    val car3 = Car(EngineType.HYBRID)
    car.start()
}
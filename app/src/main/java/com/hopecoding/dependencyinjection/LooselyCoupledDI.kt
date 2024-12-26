package com.hopecoding.dependencyinjection


class GasEngine(){
     fun start() {
        println("Gas Engine Started")
    }

}

class HybridEngine(){
    fun start() {
        println("Hybrid Engine Started")
    }

}

class ElectricEngine(){
     fun start() {
        println("Electric Engine Started")
    }
}

class Car2{
    private val gasEngine:GasEngine = GasEngine()
    private val hybridEngine:HybridEngine = HybridEngine()
    private val electricEngine:ElectricEngine = ElectricEngine()

    fun start(engineType:Int){
        if(engineType == 1){
            gasEngine.start()
        }else if (engineType == 2){
            hybridEngine.start()
        }else if(engineType ==3){
            electricEngine.start()
        }else{
            println("Invalid engine type")
        }
    }
}

fun main(){
    val car = Car2()
    car.start(1)

    val car2 = Car2()
    car2.start(2)

    val car3 = Car2()
    car3.start(3)
}
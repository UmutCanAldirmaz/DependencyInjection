package com.hopecoding.dependencyinjection

interface Engine2{
    fun start()
}

class GasEngine2P():Engine2{
    override fun start() {
        println("Gas Engine Started")
    }

}

class HybridEngine2():Engine2{
    override fun start() {
        println("Hybrid Engine Started")
    }

}

class ElectricEngine2():Engine2{
    override fun start() {
        println("Electric Engine Started")
    }
}



class Car3{
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

class Plane{
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
    val car = Car3()
    car.start(1)

    val car2 = Car3()
    car2.start(2)

    val car3 = Car3()
    car3.start(3)

    val plane = Plane()
    plane.start(1)

    val plane2 = Plane()
    plane2.start(2)

    val plane3 = Plane()
    plane3.start(3)
}
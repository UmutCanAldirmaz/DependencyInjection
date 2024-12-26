package com.hopecoding.dependencyinjection

interface Engine2{
    fun start()
}

class GasEngine2():Engine2{
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



class Car2{
    private val gasEngine:GasEngine2 = GasEngine2()
    private val hybridEngine:HybridEngine2 = HybridEngine2()
    private val electricEngine:ElectricEngine2 = ElectricEngine2()

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

class Plane2{
    private val gasEngine:GasEngine2 = GasEngine2()
    private val hybridEngine:HybridEngine2 = HybridEngine2()
    private val electricEngine:ElectricEngine2 = ElectricEngine2()

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

    val plane = Plane2()
    plane.start(1)

    val plane2 = Plane2()
    plane2.start(2)

    val plane3 = Plane2()
    plane3.start(3)
}
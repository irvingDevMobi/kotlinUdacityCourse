package mx.irving.generics

fun main() {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T : WaterSupply>(val watterSupply: T) {

    fun addWater() {
        check(!watterSupply.needsProcessed) { "water supply needs processed" }
        println("adding water from $watterSupply")
    }

}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.watterSupply.addChemicalCleaners()

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.watterSupply.filter()
    aquarium2.addWater()
}

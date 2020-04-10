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

class Aquarium<out T : WaterSupply>(val watterSupply: T) {

    fun addWater(cleaner: Cleaner<T>?) {
        if (watterSupply.needsProcessed) {
            cleaner?.clean(watterSupply)
        }
        println("adding water from $watterSupply")
    }

}

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}


fun genericExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.addWater(cleaner)

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.watterSupply.filter()
    aquarium2.addWater(null)
}

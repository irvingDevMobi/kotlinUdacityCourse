package mx.irving.generics

open class BaseBuildingMaterial(var numberNeeded: Int = 1)

class Wood() : BaseBuildingMaterial(4)

class Brick : BaseBuildingMaterial(8)

class Building<out T : BaseBuildingMaterial>(val baseMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
        get() = baseMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${baseMaterial::class.simpleName} needed")
    }
}

fun main() {
    val building = Building<Wood>(Wood())
    building.build()
}

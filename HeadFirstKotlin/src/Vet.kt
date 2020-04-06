class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (items in animals) {
        items.roam()
        items.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}

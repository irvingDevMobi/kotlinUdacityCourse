package mx.irving

fun main(args: Array<String>) {
    buildAquarium()

    val spice = SimpleSpice("Valentina","soft")
    print("Name: ${spice.name}  Spiciness Level: ${spice.heat}")

    fishExample()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
}

package mx.irving

class SimpleSpice(val name: String, val spiciness: String  = "mild") {
    init {
        println("$name $spiciness")
    }
    var heat: Int = 0
        get() = when(spiciness) {
            "hot" -> 4
            "spicy" -> 3
            "mild" -> 2
            "soft" -> 1
            else -> 0
        }

    fun makeSalt() {
        println("Now is salted")
    }
}

fun simpleSpiceEx() {
    val list = ArrayList<SimpleSpice>()
    list.add(SimpleSpice("Valentina", "hot"))
    list.add(SimpleSpice("Botanera", "spicy"))
    list.add(SimpleSpice("Guacamalo"))
    list.add(SimpleSpice("Mole"))

    val spicyAtLeast = list.filter { it.heat <= 3 }
}
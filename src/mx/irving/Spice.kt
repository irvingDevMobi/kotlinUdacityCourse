package mx.irving

class Spice(val name: String, val spiciness: String = "mild") {
    init {
        println("$name $spiciness")
    }
    var heat: Int = 0
        get() = when(spiciness) {
            "spicy" -> 7
            "hot" -> 4
            "mild" -> 2
            "soft" -> 1
            else -> 0
        }
}

fun spiceEx() {
    val list = ArrayList<Spice>()
    list.add(Spice("Poffs", "mild"))
    list.add(Spice("Churrumaiz", "mild"))
    list.add(Spice("Totis", "soft"))
    list.add(Spice("Flaming", "spicy"))
    list.add(Spice("Chetos", "hot"))

    val spicyList = list.filter { it.heat > 5 }
    print(spicyList.size)
}
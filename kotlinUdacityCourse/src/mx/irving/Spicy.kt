package mx.irving

class Spicy(val name: String, val spiciness: String = "mild") {
    init {
        println("$name $spiciness")
    }

    var heat: Int = 0
        get() = when (spiciness) {
            "spicy" -> 7
            "hot" -> 4
            "mild" -> 2
            "soft" -> 1
            else -> 0
        }
}

fun spiceEx() {
    val list = ArrayList<Spicy>()
    list.add(Spicy("Poffs", "mild"))
    list.add(Spicy("Churrumaiz", "mild"))
    list.add(Spicy("Totis", "soft"))
    list.add(Spicy("Flaming", "spicy"))
    list.add(Spicy("Chetos", "hot"))

    val spicyList = list.filter { it.heat > 5 }
    print(spicyList.size)
}

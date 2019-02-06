package mx.irving

abstract class SpiceAbs(name: String,
                        private val spiciness: String = "mild",
                        color: SpiceColor
) : SpiceColor by color {
    init {
        println("$name $spiciness")
    }

    val heat: Int
        get() = when (spiciness) {
            "spicy" -> 7
            "hot" -> 4
            "mild" -> 2
            "soft" -> 1
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry(
        spiciness: String,
        color: SpiceColor = YellowSpiceColor
) : SpiceAbs("Curry", spiciness, color),
    Grinder {

    override fun prepareSpice() {

    }

    override fun grind() {

    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = "yellow"
}

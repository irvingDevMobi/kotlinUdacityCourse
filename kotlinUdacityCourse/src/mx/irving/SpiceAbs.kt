package mx.irving

sealed class SpiceAbs(name: String,
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
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0XFF0000), GREEN(0X00FF00), BLUE(0X0000FF), YELLOW(0XFFFF00)
}
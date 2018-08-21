package mx.irving

class SimpleSpice(val name: String, val spiciness: String) {
    var heat: Int = 0
        get() = when(spiciness) {
            "mild" -> 5
            "soft" -> 1
            else -> 0
        }
}
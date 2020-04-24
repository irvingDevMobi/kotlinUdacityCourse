package mx.irving.lesson6


data class Fish(var name: String)

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    with(fish.name) {
        println(capitalize())
    }
    println(fish)
    myWith(fish.name) {
        println(capitalize())
    }
    println(fish)
    println(fish.run { name })
    println(fish.apply { })

    val fish2 = Fish(name = "splashy").apply { name = "Sharky" }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 })
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

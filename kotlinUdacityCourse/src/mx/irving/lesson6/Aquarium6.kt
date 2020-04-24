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

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisorOf3())

    print(numbers.divisibleBy {
        it.rem(3)
    })
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun List<Int>.divisorOf3(): List<Int> {
    return filter { it == 0 || it % 3 == 0 }
}

// Course Solution
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}
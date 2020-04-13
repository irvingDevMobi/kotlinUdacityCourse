package mx.irving.functional

enum class Directions {
    NORTH, SOUTH, EAST, WEST,
    START, END
}

class Game {
    var path = mutableListOf(Directions.START)
}

val northLambda: (paths: MutableList<Directions>) -> Any = {
    it.add(Directions.NORTH)
}

val southLambda: (paths: MutableList<Directions>) -> Any = {
    it.add(Directions.SOUTH)
}

val eastLambda: (paths: MutableList<Directions>) -> Any = {
    it.add(Directions.EAST)
}

val westLambda: (paths: MutableList<Directions>) -> Any = {
    it.add(Directions.WEST)
}

val endLambda: (paths: MutableList<Directions>) -> Boolean = {
    it.add(Directions.END)
    print("Game Over: ")
    println(it)
    it.clear()
    false
}

fun main() {
    val game = Game()
    println(game.path)
    northLambda(game.path)
    southLambda(game.path)
    eastLambda(game.path)
    westLambda(game.path)
    endLambda(game.path)
    println(game.path)
}

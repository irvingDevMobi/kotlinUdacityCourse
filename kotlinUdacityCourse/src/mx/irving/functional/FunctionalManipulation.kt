package mx.irving.functional

enum class Directions {
    NORTH, SOUTH, EAST, WEST,
    START, END
}

class Game {
    var path = mutableListOf(Directions.START)
    val northLambda: () -> Boolean = {
        path.add(Directions.NORTH)
    }
    val southLambda: () -> Boolean = {
        path.add(Directions.SOUTH)
    }

    val eastLambda: () -> Boolean = {
        path.add(Directions.EAST)
    }

    val westLambda: () -> Boolean = {
        path.add(Directions.WEST)
    }

    val endLambda: () -> Boolean = {
        path.add(Directions.END)
        print("Game Over: ")
        println(path)
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(move: String?) {
        when (move) {
            "n" -> move(northLambda)
            "s" -> move(southLambda)
            "e" -> move(eastLambda)
            "w" -> move(westLambda)
            else -> move(endLambda)
        }
    }
}

class Location(private val width: Int = 4, private val height: Int = 4) {
    private val map = Array(width) { arrayOfNulls<String>(height) }
    private var column = 0
    private var row = 0

    init {
        map[row][column] = "X"
    }

    fun move(direction: String?) {
        when (direction) {
            "n" -> if (row > 0) row--
            "s" -> if (row < height - 1) row++
            "w" -> if (column > 0) column--
            "e" -> if (column < width - 1) column++
        }
        map[row][column] = "X"
    }

    fun print() {
        println()
        for (line in map) {
            for (cell in line) {
                if (cell == null) print("  ") else print("$cell ")
            }
            println()
        }
    }
}

fun main() {
    val game = Game()
    println(game.path)
    game.northLambda()
    game.southLambda()
    game.eastLambda()
    game.westLambda()
    game.endLambda()
    println(game.path)
    val location = Location()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        val move = readLine()
        game.makeMove(move)
        location.move(move)
        location.print()
    }
}

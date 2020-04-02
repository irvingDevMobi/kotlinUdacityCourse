const val rock = "rock"
const val paper = "paper"
const val scissors = "scissors"

fun getGameChoice(options: Array<String>): String = options[(Math.random() * options.size).toInt()]

fun getUserChoice(options: Array<String>): String {
    print("Please enter one of the following: ")
    for (option in options) print("$option ")
    println()
    val userOption = readLine()
    return if (userOption != null && userOption in options) userOption
    else {
        println("Your option is invalid")
        getUserChoice(options)
    }
}

fun printResult(computerOption: String, userOption: String) {
    when {
        computerOption == scissors && userOption == paper || computerOption == paper && userOption == scissors ->
            println("The Scissors choice wins, as Scissors can cut Paper.")
        computerOption == rock && userOption == scissors || computerOption == scissors && userOption == rock ->
            println("The Rock choice wins, as Rock can blunt Scissors.")
        computerOption == paper && userOption == rock || computerOption == rock && userOption == paper ->
            println("The Paper choice wins, as Paper can cover Rock.")
        else -> println("It's a tie")
    }
}

fun main() {
    val options = arrayOf(rock, paper, scissors)
    val computerOption = getGameChoice(options)
    val userOption = getUserChoice(options)
    println("Computer option: $computerOption")
    println("Your option: $userOption")
    printResult(computerOption, userOption)
}

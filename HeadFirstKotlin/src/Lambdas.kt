typealias DoubleConversion = (Double) -> Double

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun getConversionLambda(string: String): DoubleConversion {
    when (string) {
        "CentigradeToFahrenheit" -> {
            return { it * 1.8 + 32 }
        }
        "KgsToPounds" -> {
            return { it * 2.204623 }
        }
        "PoundsToUsTons" -> {
            return { it / 2000.0 }
        }
        else -> {
            return { it }
        }
    }
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to itLambda: ${intLambda(100, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    convert(20.0) { it * 1.8 + 32 }
    convertFive { it * 1.8 + 32 }

    // Convert 2.5kg to Pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    // Define two lambdas
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUsTonsLambda = getConversionLambda("PoundsToUsTons")
    // Combine the two lambdas to create new one
    val kgsToUsTonsLambda = combine(kgsToPoundsLambda, poundsToUsTonsLambda)

    // use the new lambda to convert 17.4 to Us tons
    val value = 17.4
    println("$value kgs is ${convert(value, kgsToUsTonsLambda)} Us tons")
}

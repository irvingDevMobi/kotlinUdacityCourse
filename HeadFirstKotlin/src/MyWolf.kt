class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf? = Wolf()

fun main() {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y ix $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("hi", "Hello", null)
    for (item in myArray) {
        item?.let { println(it) }
    }

    getAlphaWolf()?.let { it.eat() }

    w = null
    w!!.hunger // Throw NullPointerException
}

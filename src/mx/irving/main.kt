package mx.irving

fun main(args: Array<String>) {
/*    buildAquarium()

    val spicy = SimpleSpice("Valentina","soft")
    print("Name: ${spicy.name}  Spiciness Level: ${spicy.heat}")

    fishExample()*/
    //spiceEx()
    //val derived = Derived()
    //simpleSpiceEx()
    //booksEx()
    //testCurry()
    //spiceContainerEx()
    testBookPairs()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
}


fun booksEx() {
    val ebook = Ebook("The machine", "Marquez")
    ebook.readPage()
    ebook.readPage()
    ebook.readPage()
    print(ebook.getWordsRead())
}


fun testCurry() {
    val curry = Curry("hot")
    print(curry.color)
}
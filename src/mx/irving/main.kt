package mx.irving

fun main(args: Array<String>) {
/*    buildAquarium()

    val spice = SimpleSpice("Valentina","soft")
    print("Name: ${spice.name}  Spiciness Level: ${spice.heat}")

    fishExample()*/
    //spiceEx()
    //val derived = Derived()
    //simpleSpiceEx()
    booksEx()
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
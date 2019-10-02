package mx.irving

const val williamShakespeareAuthor = "William Shakespeare"


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
    //testBookPairs()
    quiz5()
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

fun quiz5() {
    val hamletTitle = "Hamlet"
    val midsummerTitle = "A Midsummer Night's Dream"
    val allBooks = setOf(
            Book(hamletTitle, williamShakespeareAuthor),
            Book("Macbeth", williamShakespeareAuthor),
            Book("Romeo and Juliet", williamShakespeareAuthor),
            Book("Othello", williamShakespeareAuthor)
    )
    val library = mapOf(
            williamShakespeareAuthor to allBooks
    )

    library.any { it.value.any { it.title == "Hamlet" } }

    val moreBooks = mutableMapOf<String, String>()
    moreBooks[hamletTitle] = williamShakespeareAuthor

    moreBooks.getOrPut(midsummerTitle, { williamShakespeareAuthor })

    println(allBooks)
    println(library)
    println(moreBooks)
}

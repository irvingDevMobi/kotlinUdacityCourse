package mx.irving

class BookPairs(
        val title: String,
        val author: String,
        val year: String
) {
    fun getPairInfo(): Pair<String, String> = title to author

    fun getTripleInfo(): Triple<String, String, String> = Triple(title, author, year)
}

fun testBookPairs() {
    val bookPairs = BookPairs("La enseñansas de Don Juan",
            "Carlos Castanea",
            "1986")

    val (title, author, year) = bookPairs.getTripleInfo()

    println("Here is your book $title written by $author in $year")
}

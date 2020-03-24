package mx.irving

import kotlin.random.Random

data class Puppy(val name: String) {

    fun playWithBook(book: Book) {
        val turnPages = Random.nextInt(10 + 1)
        book.turnPages(turnPages)
    }
}
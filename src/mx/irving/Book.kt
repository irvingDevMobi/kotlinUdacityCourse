package mx.irving

open class Book(
        var title: String,
        var author: String
) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }

    override fun toString(): String {
        return "Book(title='$title', author='$author', currentPage=$currentPage)"
    }
}

class Ebook(
        title: String,
        author: String,
        var format: String = "default"
) : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }

    fun getWordsRead() = wordCount
}

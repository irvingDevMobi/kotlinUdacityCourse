package mx.irving

const val MAX_LOANS_ALLOWED = 10

open class Book(
        var title: String,
        var author: String
) {
    private var currentPage: Int = 0
    private var borrowed: Int = 0

    open fun readPage() {
        currentPage++
    }

    override fun toString(): String {
        return "Book(title='$title', author='$author', currentPage=$currentPage)"
    }

    fun canBorrow(): Boolean {
        return borrowed < MAX_LOANS_ALLOWED
    }

    fun printUrl() {
        println("${Constants.BASE_URL}$title.html")
    }

    companion object {
        const val baseUrl = Constants.BASE_URL
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

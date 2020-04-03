class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stop playing $title")
    }
}

fun main() {
    val songOne = Song("A good night", "John Legend")
    val songTwo = Song("Anywhere", "Rita Ora")

    songOne.play()
    songOne.stop()
    songTwo.play()
}

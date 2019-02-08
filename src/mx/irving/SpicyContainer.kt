package mx.irving

data class SpicyContainer(val spicy: Spicy) {
    val label = spicy.name
}


fun spiceContainerEx() {
    val chipotleSpice = Spicy("Chipotle", "hot")
    val habaneroSpice = Spicy("Habanero", "spicy")
    val spicyContainer = SpicyContainer(chipotleSpice)
    println(spicyContainer.label)

}

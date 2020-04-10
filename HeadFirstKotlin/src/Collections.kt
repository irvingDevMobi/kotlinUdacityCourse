fun main() {

    var mShoppingList = mutableListOf("Tea", "Egss", "Milk")
    println("mShoppingList original: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")

    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val r1 = Recipe("Chicken Soup", "Chicken")
    val r2 = Recipe("Quinoa Salad", "Quinoa")
    val r3 = Recipe("Thai Curry", "Curry")
    val r4 = Recipe("Jambalaya", "Meat")
    val r5 = Recipe("Sausage Rolls", "Sausage")
    val mRecipeMap = mutableMapOf("R1" to r1, "R2" to r2, "R3" to r3)
    println("mRecipeMap original:  $mRecipeMap")

    val recipesToAdd = mapOf("R4" to r4, "R5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")

    if (mRecipeMap.containsKey("R1")) {
        println("R1 is ${mRecipeMap.getValue("R1")}")
    }
}

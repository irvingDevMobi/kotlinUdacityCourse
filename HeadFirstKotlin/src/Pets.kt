abstract class Pet(var name: String)

class CatP(name: String) : Pet(name)

class DogP(name: String) : Pet(name)

class FishP(name: String) : Pet(name)

class VetP<T : Pet> {
    fun treat(t: T) {
        println("Treat Pet ${t.name}")
    }
}

class Contest<T : Pet>(var vet: VetP<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScores(t: T, score: Int = 0) {
        if (score > 0) scores[t] = score
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.max()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<CatP> {
    override fun sell(): CatP {
        println("Sell Cat")
        return CatP("")
    }
}

class DogRetailer : Retailer<DogP> {
    override fun sell(): DogP {
        println("Sell Dog")
        return DogP("")
    }
}

class FishRetailer : Retailer<FishP> {
    override fun sell(): FishP {
        println("Sell Fish")
        return FishP("")
    }
}

fun main() {
    val catFuzz = CatP("Fuzz LightYear")
    val catKatsu = CatP("Katsu")
    val fishFinny = FishP("Finny McGraw")

    val catVet = VetP<CatP>()
    val fishVet = VetP<FishP>()
    val petVet = VetP<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)

    val catContest = Contest<CatP>(catVet)
    catContest.addScores(catFuzz, 50)
    catContest.addScores(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScores(catFuzz, 50)
    petContest.addScores(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<FishP>(petVet)

    val dogRetailer: Retailer<DogP> = DogRetailer()
    val catRetailer: Retailer<CatP> = CatRetailer()
    val peRetailer: Retailer<Pet> = CatRetailer()
    peRetailer.sell()
}

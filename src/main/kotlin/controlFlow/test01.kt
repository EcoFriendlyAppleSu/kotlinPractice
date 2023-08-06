package controlFlow

fun main() {
    val cakes = listOf<String>("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("this is $cake favor cake")
    }
    var cakesEaten = 0
    var cakesBaken = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten += 1
    }

    do {
        bakeACake()
        cakesBaken ++
    } while (cakesBaken < cakesEaten)

    val zoo = Zoo(mutableListOf(Animal("tiger"), Animal("lion")))

    val otherAnimal = Animal("Frog")

    zoo.addAnimal(otherAnimal)

    for (animal in zoo) {
        println("${animal.name}") // != {$animal.name}
    }
}

fun eatACake() = println("Eat A Cake")
fun bakeACake() = println("Bake A Cake")

class Animal(val name: String)


class Zoo(private val animals: MutableList<Animal> = mutableListOf()) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }

    fun addAnimal(animal: Animal) {
        animals.add(animal)
    }
}


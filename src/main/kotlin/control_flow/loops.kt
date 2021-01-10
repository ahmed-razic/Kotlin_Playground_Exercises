package control_flow

fun main() {
    val cakes = listOf<Any>("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummu, it's a $cake cake!")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatCake()
        println(cakesEaten)
        cakesEaten++
    }

    do {
        bakeCake()
        println(cakesBaked)
        cakesBaked++

    } while (cakesBaked < cakesEaten)

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion"), Animal("elephant")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}


fun eatCake() = println("Eat a Cake")
fun bakeCake() = println("Bake a cake")

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}
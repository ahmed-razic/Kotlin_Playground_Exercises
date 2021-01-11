package special_classes

sealed class Mammal(val name: String)

class Cat(private val catName: String) : Mammal(catName)
class Human(private val humanName: String, val job: String) : Mammal(humanName)


fun main(){
    val color5 = Color.YELLOW
    println(color5)
    println(greetMammal(Cat("snowy")))
    println(greetMammal(Human("Ahmed", "programmer.")))

}

fun greetMammal(mammal: Mammal): String {

    return when(mammal) {
        is Cat -> "Hello ${mammal.name}"
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
    }
}

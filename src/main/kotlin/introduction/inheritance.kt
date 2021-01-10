package introduction

open class Dog {
    open fun sayHello() {
        println("wow wow")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger is from $origin and says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")


open class Lion(val name: String, val origin: String) {
    open fun sayHello() {
        println("$name is from $origin and says: grraaaoohhh!")
    }
}

class AsiaticLion(name: String) : Lion(name = name, origin = "Indian")

class AfricanLion (name: String, origin: String = "Africa") : Lion(name = name, origin = origin) {
    override fun sayHello() {
        println("This is lion named $name and he is from $origin.")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = AsiaticLion("Rufo")
    lion.sayHello()

    val lionAfrica: Lion = AfricanLion("Osman")
    lionAfrica.sayHello()
}
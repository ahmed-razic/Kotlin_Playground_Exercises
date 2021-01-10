package introduction

import kotlin.reflect.typeOf

//named functions, single-expression functions and function default parameters

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int): Int = x * y

//infix function

infix fun Int.times(str: String): String = str.repeat(this)

infix fun String.onto(other: String) = Pair(this, other)

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}
}


//varargs parameters

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printWithPrefix(vararg message: String, prefix: String) {
    for (m in message) println(prefix + m)
}

fun log(vararg  entries: String) {
    printAll(*entries)
}



fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix("Hi", "Bye")
    printMessageWithPrefix(prefix = "this is prefix", message = "this is message")

    println(sum(5, 2))
    println(multiply(3, 11))

    println( 3 times("Bye "))
    val pair = "Ferrari" to "Katrina"
    println(pair)

    val myPair = "This" onto "That"
    println(myPair)

    val sophia = Person("sophia")
    val claudia = Person("claudia")

    claudia likes sophia

    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting: ")
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

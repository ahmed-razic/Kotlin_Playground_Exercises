package control_flow

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

    println("---------------------")

    println(cases1("Hello"))
    println(cases1(1))
    println(cases1(0L))
    println(cases1(MyClass()))
    println(cases1("hello"))
}

class MyClass

fun cases(obj: Any) {
    when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

fun cases1(obj: Any) : Any {
    return when(obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> true
        !is String -> "Not a string"
        else -> 42
    }
}
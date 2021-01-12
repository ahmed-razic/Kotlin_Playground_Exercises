package collections

fun main() {

    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)

    val doubled = numbers.map { c -> 2 * c }

    val tripled = numbers.map {it * 3}

    println(numbers)
    println(doubled)
    println(tripled)
}
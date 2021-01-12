package collections

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val empty = emptyList<Int>()

    println(numbers.minOrNull())
    println(numbers.maxOrNull())
    println(empty.minOrNull())
}
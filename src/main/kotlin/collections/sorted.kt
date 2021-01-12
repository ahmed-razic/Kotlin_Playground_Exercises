package collections

import kotlin.math.absoluteValue

fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3, -7, -8, 7)
    val natural = shuffled.sorted()
    val inverted1 = shuffled.sortedBy { it }
    val inverted2 = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { it.absoluteValue }

    println(natural)
    println(inverted1)
    println(inverted2)
    println(descending)
    println(descendingBy)
}
package productivity_booster


fun main() {
    val(a, b, c) = arrayOf(1, 2, 3)
    println("$a, $b and $c")

    val map = mapOf("Alice" to 21, "Bob" to 25)

    for((name, age) in map) {
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(90, 87, 56, 48, 33, 18, 7))
    println("min: $min, max: $max")
}

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    val pair: Pair<Int?, Int?>
    val min = list.minOfOrNull { it } ?: 0
    val max = list.maxOfOrNull { it } ?: 0
    pair = Pair(min, max)

    return pair
}
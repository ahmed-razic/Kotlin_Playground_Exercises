package introduction

import kotlin.reflect.typeOf

@ExperimentalStdlibApi
fun main() {
    println(2 times2 "this is a string " )
    println(2.0 divide 4 )
    println(2.0 divide (100))

    println("prefix" concat "name")

    val pair = "Ahmed " onto2 "Razic"
    println(pair::class.simpleName)

    val division = 100.0 multi "50"

    println("result: $division, typeOf: ${division::class.simpleName}")
}

infix fun Int.times2(str: String) = str.repeat(this)

infix fun Double.divide(num: Int): Double = this / num

infix fun String.concat(str: String) = "$this-$str"

infix fun String.onto2(str: String): Pair<String, String> = Pair(this, str)

infix fun Double.multi(numString: String): Int = (this / numString.toDouble()).toInt()
package functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int) : Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(10, 20, ::sum)
    val multiResult = calculate(10, 20) {x: Int, y:Int -> x * y}

    println("sumResult $sumResult, mulResult $multiResult")

    val func = operation()
    println(func(3))
    println(square(3))

    println(func::class.simpleName)
    println(::square::class.simpleName)
}

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

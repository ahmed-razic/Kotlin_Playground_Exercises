package control_flow


fun main() {
    println(max(456, 58))
    println(max(456, 498))
}

// In Kotlin there is no ternary operator, instead "if - else" is used
fun max(a: Int, b: Int) = if(a > b) a else b
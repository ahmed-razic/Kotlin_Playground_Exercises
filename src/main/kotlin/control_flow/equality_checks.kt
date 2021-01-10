package control_flow

//a == b compiles down to if (a == null) b == null else a.equals(b)
//Kotlin uses == for structural comparison and === for referential comparison.


fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)
}

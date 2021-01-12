package scope_functions


fun main() {
    val empty = "test".let {
        customPrint(it)
        it.toUpperCase()
    }

    println("is empty $empty")

    printNonNull(null)
    printNonNull("my string")

}



fun customPrint(name: String) {
    println(name)
}


fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

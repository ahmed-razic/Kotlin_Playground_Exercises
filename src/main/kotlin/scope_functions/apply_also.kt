package scope_functions

class Person(var name: String = "name", var age: Int = 10, var about: String = "job") {

}

fun main() {
    val jake = Person()

    val stringDescription = jake.apply {
        name = "Jake"
        age = 46
        about = "android developer"
    }

    println(stringDescription.toString())

    val jake2 = Person("Jake2", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }

}

fun writeCreationLog(it: Person) {

}

package special_classes

data class User(val name: String, val id: Int)

fun main() {
    val firstUser = User("Ahmed", 100)
    val secondUser = User("Ibrahim", 200)
    val thirdUser = User("Amina", 300)
    val fourthUser = User("Merjema", 400)

    println(firstUser)
    println(firstUser.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())
    println(fourthUser.hashCode())

    println("----------------------------")
    val fifthUser = secondUser.copy()
    println(secondUser.hashCode())
    println(fifthUser.hashCode())
    println("${secondUser == fifthUser}")

    println("----------------------------")
    println(firstUser.component1())
    println(firstUser.component2())

    val sixthUser = fourthUser.copy("sixthUser", 600)
    println("Sixth user name: ${sixthUser.component1()} \nSixth user ID: ${sixthUser.id}")



}
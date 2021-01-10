package introduction

class Customer

class Contact(val id: Int, var email: String)

class Car(VIN: Int, val model: String) {
    val VIN: Int = VIN
}

fun main() {
    val customer = Customer()

    println(customer)
    val contact = Contact(101, "me@myself.com")
    println(contact.id)
    println(contact.email)
    contact.email = "him@himself.com"
    println(contact.email)

    val myCar = Car(123456789, "Golf")
    println(myCar.VIN)
    println(myCar.model)
}
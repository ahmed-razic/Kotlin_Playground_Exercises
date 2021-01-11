package special_classes

import java.util.*

class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random().nextInt(90)
        println(objRandom)
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(10, 2, 1)
    DoAuth.takeParam("Ahmed", "password")

    val name30: DoAuth = DoAuth
    println(name30::class.simpleName)

    name30.takeParam("name", "pass")
    name30

    BigBen.getBongs(7)
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard = standardDays * 30
        var festivity = festivityDays * 50
        var special = specialDays * 100
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $total")
    println(dayRates::class.simpleName)


}

object DoAuth {
    fun takeParam(username: String, password: String) {
        println("$username: $password")
    }
}

class BigBen {                                  //1
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

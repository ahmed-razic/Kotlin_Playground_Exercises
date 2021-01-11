package special_classes

enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(private val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = this.rgb and  0xFF0000 != 0
}

fun main() {


    val color2 = Color.GREEN
    println("color2: $color2")

    val state = State.RUNNING
    println(state::class.simpleName)
    println(state)

    val message = when(state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
        //else -> "It's out of control!!!"
    }
    println(message)

    val red = Color.RED
    println(red)
    println(red::class.simpleName)
    println(red.containsRed())
    println(Color.BLUE.containsRed())

    //val state2 = State()

    //val baseMammal1 = Mammal("other mammal")
}
package delegation

interface SoundBehaviour {
    fun makeSound()
}

class ScreamBehaviour(val n:String) : SoundBehaviour {
    override fun makeSound() = println("${n.toUpperCase()}")
}

class RockAndRollBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

class TomAraya(n:String) : SoundBehaviour by ScreamBehaviour(n)
class ElvisPresley(n: String) : SoundBehaviour by RockAndRollBehaviour(n)

fun main() {
    val tom = TomAraya("Trash Metal")
    tom.makeSound()
    val elvis = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvis.makeSound()
}
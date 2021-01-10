package introduction

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty(): Boolean = elements.isEmpty()

    fun size(): Int = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString(", ")})"
    }
}
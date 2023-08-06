class Customer(val id: Int, var email: String) {

}

class MutableStack<E>(vararg items: E) {              // 1

    private val elements = mutableListOf<E>()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg element: E) = MutableStack(* element)

fun main() {
    var stack = mutableStackOf("hello", "world", "Lee")

    println(stack)
}

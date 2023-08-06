package controlFlow

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(1))
    println(whenAssign(0L))
    println(whenAssign( MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> true
        else -> 442
    }
    return result
}

class MyClass

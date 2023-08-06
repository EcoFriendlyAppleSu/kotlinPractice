package controlFlow

enum class State(name: String) {
    TENNIS("테니스"), RUNNING("러닝"), SWIMMING("수영")
}

fun main() {
    val state = State.RUNNING

    val message = when (state) {
        State.SWIMMING -> "It's Swimming"
        State.TENNIS -> "It's Tennis"
        State.RUNNING -> "It's Running"
    }

    println(message)

    val message1 = when (state.name) {
        State.SWIMMING.name -> "hello world"
        else -> "nono"
    }
    println(message1)
}

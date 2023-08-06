/*
* 코틀린은 타입 추론을 제공합니다.
* */
fun main() {

    val c = 3 // compiler infers the type Int
    val d: Int // Variable 'd' must be initialized
}

fun differPointBetweenValAndVar() {


    // var keyword can change
    var a: String = "initial"
    println(a)
    a = "chage String"
    println(a)

    // Val cannot be reassigned
    val b: String = "init Str"
    println(b)
    // b = "change str"
}

fun variableRule() {
    val element: Int

    if (someCondition()) {
        element = 11
    } else {
        element = 22
    }

    // It must be initialized before the first read.
    println(element)
}

fun someCondition(): Boolean {
    return true
}

import java.util.Objects

/*
* About Null Safety : If you need a variable that can be null, declare it nullable by adding ? at the end of its type.
* */
fun main() {

    var neverNull: String = "This Can't be Null"

    // neverNull = null return Null can not be a value of a non-null type String

    var nullableStr: String? = "This can be Null"

    nullableStr = null // it's Okay

    println("Null 변수를 출력하면 결과값은 $nullableStr 입니다.")

    var inferredNonNull = "The compiler assumes non-null"

    // inferredNonNull = null return Null can not be a value of a non-null type String. "?" 가 없는 것이 default 인 것을 알 수 있음.

    println(strLength(neverNull))
    // println(strLength(nullableStr)) return Type mismatch: inferred type is Nothing? but String was expected.
    // type을 강제합니다.
}

fun strLength(notNull: String): Int {
    return notNull.length
}

/*
* Sometimes Kotlin programs need to work with null values, such as when interacting with external Java code or representing a truly absent state.
* Null이 필요할 때, 사용 방법
* */
fun needNullableVar(nullableVar: String?) {
    if (nullableVar != null) {
        println("var is not null")
    }
    println("var is null")
}

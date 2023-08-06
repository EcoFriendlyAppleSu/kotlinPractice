package controlFlow

/*
* 동등성 체크 시 == 와 === 사용
* */

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // a == b compiles down to if (a == null) b == null else a.equals(b). 또한 set은 순서가 상관 없지만 코틀린에선 equals 연산을 통과시킵니다.
    println(authors === writers) // Returns false because authors and writers are distinct references. 즉, 주소값을 비교합니다.
}

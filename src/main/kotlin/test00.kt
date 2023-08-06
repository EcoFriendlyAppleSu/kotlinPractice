/*
* infix : infix 키워드는 중위 표기법으로 함수를 호출할 수 있도록 해줍니다. 중위 표기법은 수식을 좀 더 가독성 있게 만들어주며, 일반적으로 a 함수 b 형태로 사용됩니다.
*
* operator : operator 키워드는 클래스의 멤버 함수를 연산자 오버로딩(Operator Overloading)하기 위해 사용됩니다.
* 연산자 오버로딩은 특정 연산자를 클래스에 대해 사용자 정의한 방식으로 동작하도록 변경하는 것을 의미합니다.
* */
fun main() {
    /*infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")*/

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    sophia.printLinkedPeople()

    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    // 아래와 같이 Operator를 사용한다면 String Class의 맴버 함수를 오버로딩해 사용할 수 있습니다.
    operator fun String.get(range: IntRange) = substring(range)
    val testStr = "Always forgive your enemies"
    println(testStr[0 .. 7])

}

class Person(val name: String) {

    private val linkedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { linkedPeople.add(other) }

    fun printLinkedPeople(){
        for (person in linkedPeople) {
            println(person.name)
        }
    }
}

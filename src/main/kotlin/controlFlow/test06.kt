package controlFlow

/*
* sealed class를 사용하면 런타임의 에러를 컴파일 레벨로 내릴 수 있어 방어적 코드를 작성할 수 있습니다.
*
* sealed class란 추상 클래스로 상속 받는 자식 클래스의 종류를 제한하는 특성을 갖고 있습니다.
* sealed class는 자식 클래스에 대한 선언을 같은 패키지 내로 제한합니다.
* sealed class 또한 추상 클래스로 직접 객체 인스턴스 생성이 불가합니다.
*
* '''
* Sealed classes let you restrict the use of inheritance.
* Once you declare a class sealed, it can only be subclassed from inside the same package where the sealed class is declared.
* It cannot be subclassed outside of the package where the sealed class is declared.
* '''
* */
sealed class PersonState()

class Running : PersonState()
class Walking : PersonState()
class Idle : PersonState()

fun main() {
}

fun getStateMessage(personState: PersonState): String {
    return when (personState) {
        is Running -> "Person is Running"
        is Walking -> "Person is Walking"
        is Idle -> "Person is Idle"
    }
    // sealed class로 선언해 같은 패키지에 상속 받은 객체를 알고 있어 else로 분기 처리를 하지 않아도 됩니다.
}

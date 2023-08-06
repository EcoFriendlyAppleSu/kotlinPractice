package controlFlow

/*
* object keyword를 사용해 클래스를 생성할 수 있습니다. 자바의 익명함수처럼 생성해 사용할 수 있습니다.
* object를 직접 사용하면 변수를 사용하지 못하고 바로 맴버에 접근해 사용할 수 있습니다.
* */
fun main() {
    val luckDispatcher1 = LuckDispatcher()
    val luckDispatcher2 = LuckDispatcher()

    println(luckDispatcher1.getNumber())
    println(luckDispatcher2.getNumber())

    println(luckDispatcher1 == luckDispatcher2)
    println(luckDispatcher1 === luckDispatcher2)

    makingClassUsingObjectKeyword(10, 2, 1)

    BigBen.getBongs(12)
}

fun makingClassUsingObjectKeyword(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = standardDays * 30
        var festival: Int = festivityDays * 50
        var special: Int = specialDays * 100
    }
    val total = dayRates.standard + dayRates.festival + dayRates.special
    println("total price is $total")

}

class BigBen {
    // Act Like Static Method in Java
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}


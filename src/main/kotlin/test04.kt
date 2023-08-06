/*
* Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
* */
open class Dog {
 open fun barking() {
  println("wow")
 }
}

class Yorkshire : Dog() {
 override fun barking() {
  println("wif")
 }
}

open class Tiger(val origin: String) {
 fun barking() {
  println("A tiger says : $origin")
 }
}

class SiberianTiger : Tiger("Siberia")

fun main() {

 val dog: Dog = Yorkshire()

 dog.barking()

 val tiger: Tiger = SiberianTiger()
 tiger.barking()
}

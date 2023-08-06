package controlFlow

/*
* 데이터 클래스(Data class)는 데이터 보관 목적으로 만든 클래스를 말합니다.
* 데이터 클래스는 프로퍼티에 대한 toString(), hashCode(), equals(), copy() 메소드를 자동으로 만들어 줍니다.
* */

data class Site(val url: String, val title: String) {
}

fun main() {
    val site1 = Site("lee.com", "lee")
    val site2 = site1.copy(title = "kim")
    println(site1)
    println(site2)
    println()

    println(site1.toString())
    println(site1.hashCode())
    println(site2.toString())
    println(site2.hashCode())

    val (url, title) = site1
    println(url)
    println(title)


}

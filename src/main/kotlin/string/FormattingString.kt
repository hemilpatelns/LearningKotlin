package string

fun main() {
    val s = String.format("%S", "Glory Glory Man United")
    val num = 1999
    val numF = String.format("%.2f", 10.66666)
    println(s)
    println("%05d".format(num))
    println(numF)
}
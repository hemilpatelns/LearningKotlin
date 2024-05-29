package array

fun main() {
    val twoD = Array(3) { Array<Int>(3) { 0 } }
    val threeD = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(twoD.contentDeepToString())
    println(threeD.contentDeepToString())
}
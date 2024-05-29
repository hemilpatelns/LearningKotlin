package array

fun main() {
// Creating an array
    val arrayOne = arrayOf(1, 2, 3)
    val arrayTwo = Array(3) { 0 }
    val arrayThree = Array<String>(5) { "T" }
    val arraySeven = Array(5) { i -> (i * i).toString() }

// Creating null array
    val arrayFour = arrayOfNulls<String>(4)
    val arrayFive: Array<String?> = arrayOfNulls(5)
    val arraySix = Array<String?>(3) { null }

// Creating empty array
    val arrayEight = emptyArray<Int>()

    println(arrayOne.joinToString())
    println(arrayTwo.joinToString())
    println(arrayThree.joinToString())
    println(arrayFour.joinToString())
    println(arrayFive.joinToString())
    println(arraySix.joinToString())
    println(arrayEight.joinToString())
    arraySeven.forEach { println(it) }
}
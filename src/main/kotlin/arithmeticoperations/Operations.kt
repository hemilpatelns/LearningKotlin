package arithmeticoperations

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun subtraction(a: Int, b:Int):Int{
    return a-b
}

fun multiplication(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Int, b: Int): Double {
    return a.toDouble() / b.toDouble()
}

fun modulus(a: Int, b: Int): Int {
    return a % b
}

fun main() {
    println(addition(2,3))
    println(subtraction(7,6))
    println(multiplication(4,5))
    println(division(5,3))
    println(modulus(10,3))
    val num1: Int = 10
    val num2: Float = 45.5f
    val result = num1 + num2
    print(result)
}
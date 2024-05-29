package controlflow

fun main() {
    println(verifyAge(18))
    println(verifyDocuments("Pan"))
    val numberOne = 21
    val numberTwo = 23
    println("Maximum between $numberOne and $numberTwo is ${maxValue(numberOne, numberTwo)}")
}

//  if else expression
fun verifyAge(age: Int): String {
    if (age < 18) {
        return "You can't vote"
    } else {
        return "You can vote"
    }
}

//  else if expression
fun verifyDocuments(document: String): String {
    return if (document == "Aadhar") {
        "Your identity is approved via Aadhar!"
    } else if (document == "Pan") {
        "Your identity is approved via Pan!"
    } else {
        "Identity not verified"
    }
}

fun maxValue(numberOne: Int, numberTwo: Int): Int {
    val max = if (numberOne >= numberTwo) numberOne else numberTwo
    return max
}
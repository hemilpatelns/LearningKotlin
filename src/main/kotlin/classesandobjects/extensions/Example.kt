package classesandobjects.extensions

fun <T : Number> T.add(other: T): T {
    return when (this) {
        is Int -> (this.toInt() + other.toInt()) as T
        is Double -> (this.toDouble() + other.toDouble()) as T
        is Float -> (this.toFloat() + other.toFloat()) as T
        is Long -> (this.toLong() + other.toLong()) as T
        is Short -> (this.toShort() + other.toShort()) as T
        else -> throw IllegalArgumentException("Unsupported type")
    }
}

fun main() {
    val result = 5.add(3)
    println("Result: $result")
}
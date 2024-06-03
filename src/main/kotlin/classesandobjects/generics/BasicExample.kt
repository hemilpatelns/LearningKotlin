package classesandobjects.generics

class BoxOfObjects<T>(t: T) {
    var info = when (t) {
        is String -> println(t)
        is Int -> println(t)
        else -> {
            println("Something different")
        }
    }
}

fun main() {
    val obj = BoxOfObjects(1)
    val objTwo = BoxOfObjects("This is a string generics")
}

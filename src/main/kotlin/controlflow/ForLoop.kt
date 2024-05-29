package controlflow

fun main() {
    val hierarchy = arrayOf("Fresher", "Experienced", "Team Leader", "Delivery Manager")

    println("<---------------- Version 1 ---------------->")
    for (post in hierarchy) {
        println(post)
    }

    println("<---------------- Version 2 ---------------->")
    for (post: String in hierarchy) {
        println(post)
    }

    println("<---------------- Version 3 ---------------->")
    for (post in 1..3) {
        println(hierarchy[post])
    }

    println("<---------------- Version 4 ---------------->")
    for (post in hierarchy.size - 1 downTo 0 step 2) {
        println(hierarchy[post])
    }

    println("<---------------- Version 5 ---------------->")
    for (post in hierarchy.indices) {
        println(hierarchy[post])
    }

    println("<---------------- Version 6 ---------------->")
    for ((index, value) in hierarchy.withIndex()) {
        println("The element at index $index is $value")
    }
}
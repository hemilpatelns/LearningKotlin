package classesandobjects.inheritance

open class Parent(val name: String = "Hem", val age: Int) {
}

//class Child(name: String, age: Int): Parent("Hemil", 23) {
//
//}

class Child: Parent {
    constructor(): super("Hemil",23)
}

fun main() {
    val child = Child()
    println("I am ${child.name}, my age is ${child.age}")
}
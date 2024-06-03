package classesandobjects.interfaceconcept

import kotlin.math.PI

interface Draggable {
    fun drag()
}
fun main(){
    dragObjects(arrayOf(Circle(4.5), Square(5.6),Person("Hemil")))

}

fun dragObjects(objects: Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }
}

abstract class Shape() : Draggable {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Square(val side: Double) : Shape() {
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class Person(val name: String) : Draggable{
    override fun drag() = println("$name is dragging")
}
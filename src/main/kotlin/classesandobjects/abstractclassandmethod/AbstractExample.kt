package classesandobjects.abstractclassandmethod

import kotlin.math.PI

abstract class Shape {
    abstract fun area(): Number
    fun className(){
        print("Area of $this is ")
    }

}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Rectangle(val length: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return length * height
    }
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun main() {
    val circle = Circle(4.5)
    circle.className()
    println(circle.area())
    val rectangle = Rectangle(23.0,15.5)
    rectangle.className()
    println(rectangle.area())
    val triangle = Triangle(13.6,32.4)
    triangle.className()
    println(triangle.area())
}

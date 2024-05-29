package classesandobjects.constructorexample

class Car(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String) {

    constructor(carName: String, carEngine: String): this(carName,4 , 5, carEngine)
}

fun main() {
    val ford = Car("Ford", 4, 5, "Petrol")
    val honda = Car("Honda", "Diesel")
    println("${ford.name} has ${ford.tyres} tyres, ${ford.maxSeating} seating capacity and a ${ford.engineType}")
    println("${honda.name} has ${honda.tyres} tyres, ${honda.maxSeating} seating capacity and a ${honda.engineType}")
}
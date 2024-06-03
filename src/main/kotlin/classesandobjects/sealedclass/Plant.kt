package classesandobjects.sealedclass

sealed class Plant(val info: String)
class Flower(val type: String, val price: Double) : Plant(type)
class Fruit(val type: String, val taste: String) : Plant(type)

fun main() {
    val flower: Plant = Flower("Rose", 35.55)
    val fruit: Plant = Fruit("Apple", "sweet")
    log(fruit)
    log(flower)
}

fun log(plant: Plant) = when(plant){
    is Flower -> println("I am ${plant.info}, and I'll cost ${plant.price}")
    is Fruit -> println("I am ${plant.info}, and I'm ${plant.taste}")
}
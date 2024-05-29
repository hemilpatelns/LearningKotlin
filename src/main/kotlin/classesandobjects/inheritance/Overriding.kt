package classesandobjects.inheritance

open class Water {
    open val flavour: String = "ordinary"
    open val texture: String = "plain"

    open fun flowSpeed() {
        println("Water flows quickly")
    }

    open fun constitution() {
        println("Water is made up of one hydrogen and two oxygen molecules")
    }
}

class Soup : Water() {
    override val flavour: String = "tasty"
    override val texture: String = "creamy"

    override fun flowSpeed() {
        super.flowSpeed()
        println("Soup flows slowly")
    }

    override fun constitution() {
        println("Soup is made up of different spices and water")
        super.constitution()
    }
}

fun main() {
    val water = Water()
    val soup = Soup()

    println("Water is ${water.flavour} and ${water.texture}")
    println("Soup is ${soup.flavour} and ${soup.texture}")

    soup.flowSpeed()
    soup.constitution()
}
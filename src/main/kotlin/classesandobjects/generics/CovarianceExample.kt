package classesandobjects.generics

open class MechanicalParts{
    open fun description(){
        println("I am a mechanical part")
    }
}

class Screw: MechanicalParts(){
    override fun description() {
        println("I am a screw")
    }
}

class Bolt: MechanicalParts(){
    override fun description() {
        println("I am a bolt")
    }
}

class Box<out T>(val item: T)

fun getMechanicalBox(): Box<MechanicalParts>{
    return Box(Screw())
}

fun main() {
    val mechanical: Box<MechanicalParts> = getMechanicalBox()
    mechanical.item.description()
}
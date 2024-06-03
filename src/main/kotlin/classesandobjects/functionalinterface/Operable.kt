package classesandobjects.functionalinterface

fun interface Operable {
    fun operate(i: Int): Boolean
    val name: String get() = "Hemil"
}


// Anonymous object without lambda expression
//val op = object : Operable {
//    override fun operate(i: Int): Boolean {
//        return i % 2 == 0
//    }
//}

// Anonymous object with lambda expression
val op = Operable { it % 2 == 0 }

fun main(){
    println("Is 13 an even number?\n${op.operate(13)}")
}
package classesandobjects.dataclasses

data class Person(val name: String, val age: Int) {

}

fun main(){
    val personOne = Person("Hemil", 23)
    val (name, age) = personOne // destructuring declaration
    println("$name is $age years old")
    val personTwo = personOne.copy(name = "Gaurav")
    println("${personTwo.component1()} is ${personTwo.component2()} years old") // component functions
}
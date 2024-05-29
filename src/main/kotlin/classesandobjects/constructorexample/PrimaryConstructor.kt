package classesandobjects.constructorexample

// Primary constructor example
class Employee(val employeeId: Int, val employeeName: String, val employeeExperience: Float) { // properties

    // Initializer block
    init {
        println("Hello $employeeName, your Employee Id is $employeeId with $employeeExperience years of experience")
    }
}

fun main() {
    Employee(1, "Amey", 2.1F)
    Employee(2, "Abdul Gani", 2.2F)
    Employee(3, "Gaurav", 2.3F)
    Employee(4, "Hemil", 2.4F)
}
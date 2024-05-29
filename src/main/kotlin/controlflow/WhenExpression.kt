package controlflow

import java.util.Scanner

fun main(){
//    checkingDevice()
    checkingRemark()
}

fun checkingDevice(){
    print("Enter the mobile name: ")
    val mobileName = readlnOrNull()
    when(mobileName){
        "Xiaomi", "Samsung", "Oppo", "Nothing" -> println("You have an Android phone")
        "Iphone" -> println("You have an iOS phone")
        else -> println("You don't have a phone")
    }
}

fun checkingRemark(){
    val read = Scanner(System.`in`)
    print("Enter your percentage of marks you obtained: ")
    when(read.nextFloat()){
        in 80.00..100.00 -> println("Your grade is Outstanding")
        in 75.00..79.99 -> println("Your grade is Excellent")
        in 70.00..74.99 -> println("Your grade is Very Good")
        in 60.00..69.99 -> println("Your grade is Good")
        in 50.00..59.99 -> println("Your grade is Above Average")
        in 45.00..49.99 -> println("Your grade is Average")
        in 40.00..44.99 -> println("Your grade is Pass")
        in 00.00..39.99 -> println("You failed")
        else -> println("Invalid!")
    }

}
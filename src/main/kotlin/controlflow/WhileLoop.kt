package controlflow

import java.util.Scanner

fun main() {
    recheckingConnectionSpeed()
}

fun checkingConnectionSpeed() {
    val read = Scanner(System.`in`)
    var isWorking = true
    while (isWorking) {
        print("Enter your internet speed: ")
        if (read.nextFloat() == 0F) {
            isWorking = false
        } else println("Your internet is working")
    }
    println("Your internet has stopped working")
}

fun recheckingConnectionSpeed() {
    val read = Scanner(System.`in`)
    var internetSpeed: Float
    do {
        print("Enter your internet speed: ")
        internetSpeed = read.nextFloat()
        println("Your internet is working")
    } while (internetSpeed != 0F)
    println("Your internet has stopped working")
}
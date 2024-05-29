package controlflow

fun main() {
    numbers()
    println()
    numbersOne()
    println()
    numbersTwo()
    println()
    numbersThree()
    println()
    numbersFour()
}

fun numbers(){
    val arr = arrayOf(1,2,3,4,5,6)
    for(a in arr){
        if(a==3) return
        print(a)
    }
    println("This won't run")
}

fun numbersOne(){
    listOf(1,2,3,4,5,6).forEach lit@{
        if(it==3) return@lit
        print(it)
    }
    println("Explicit label call")
}

fun numbersTwo(){
    listOf(1,2,3,4,5,6).forEach {
        if(it==3) return@forEach
        print(it)
    }
    println("Implicit label call")
}

fun numbersThree(){
    listOf(1,2,3,4,5,6).forEach(fun (value: Int) {
        if(value==3) return
        print(value)
    })
    println("Anonymous function return")
}

fun numbersFour(){
    run loop@{
        listOf(1,2,3,4,5,6).forEach {
            if(it==3) return@loop
            print(it)
        }
    }
    println("Through nested loop")
}
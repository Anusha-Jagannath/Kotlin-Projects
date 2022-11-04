/*
* This is a main function. Entry point of the application
*
* */
//fun main(args: Array<String>) {
//    println("Hello World, I am learning kotlin")
//    print("Anusha")
//    println("Hello")
//    println(10-9)
//    println(10.0/9.0)
//}

//fun main(args: Array<String>) {
//    var myString = "Hello world"
//    println(myString)
//
//    var myNumber = 10
//    println(myNumber)
//
//    var myDecimal = 1.0
//    println(myDecimal)
//
//    val s1: String
//    s1 = "Hello World"
//    s1 = "Another World"
//
//}

//fun main(args: Array<String>) {
//    var name = "steve"
//    display(name)
//}
//
//fun display(name: String) {
//    println(name)
//}

fun main(args: Array<String>) {
    var p1 = Person()
    p1.name = "steve"
    println(p1.name)
}

class Person {
    var name: String = ""
}
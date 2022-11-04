package july4

fun main(args: Array<String>) {
    var human = Human()
    human.age = 45
    println("Age is ${human.age}")
}

class Human {
    var age: Int = 0
}
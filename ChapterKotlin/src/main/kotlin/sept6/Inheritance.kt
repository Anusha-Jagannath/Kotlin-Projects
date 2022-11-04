package sept6

fun main(args: Array<String>) {
    //to avoid code repetition
    var str = "Kotlin      Is    Awesome"

    str = str.replace("\\s+".toRegex(), " ")

    println(str)
}

open class Animal {

    var color: String = ""
    fun eat() {

    }
}

class Dog : Animal() {
    var breed: String = ""
    fun bark() {
        println("The dog is barking")
    }
}

class Cat : Animal() {
    var age: Int = 1
    fun meow() {
        println("The cat is meowing")
    }
}
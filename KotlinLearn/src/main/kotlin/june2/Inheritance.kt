package june2

fun main(args: Array<String>) {

}

open class Animal {

    var color: String = ""

    fun eat() {
        println("eating")
    }
}

class Dog: Animal() {
    var breed: String = ""

    fun bark() {
        println("The dog is barking")
    }
}

class Cat: Animal() {
    var age: Int = -1
    fun meow() {
        println("The cat sis meowing")
    }
}
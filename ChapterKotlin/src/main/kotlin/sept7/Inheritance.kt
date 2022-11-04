package sept7

fun main(args: Array<String>) {
    var dog = Dog()
    dog.breed ="po"
    dog.color = "black"
    dog.breed
    dog.eat()

    var cat = Cat()
    cat.age = 2
    cat.color = "k"
    cat.eat()
    cat.meow()
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
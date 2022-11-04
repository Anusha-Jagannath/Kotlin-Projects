package june3

fun main(args: Array<String>) {

    var dog = Dog()
    println(dog.color)
    dog.eat()

    var cat = Cat()
    cat.eat()

    var animal = Animal()
    animal.eat()
}

open class Animal {

    open var color: String = "white"

    open fun eat() {
        println("eating")
    }
}

class Dog: Animal() {
    var breed: String = ""
    override var color: String ="black"

    fun bark() {
        println("The dog is barking")
    }

    override fun eat() {
        super<Animal>.eat()
        println("The dog is eating")
    }
}

class Cat: Animal() {
    var age: Int = -1
    fun meow() {
        println("The cat sis meowing")
    }

    override fun eat() {
        super.eat()
        println("The cat is eating")
    }
}
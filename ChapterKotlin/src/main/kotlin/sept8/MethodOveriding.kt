package sept8


fun main(args: Array<String>) {
    var dog = Dog1()
//    dog.breed ="po"
//    dog.color = "black"
//    dog.breed
    println(dog.color)
    dog.eat()

    var cat = Cat1()
    cat.age = 2
    cat.color = "k"
    cat.eat()
    cat.meow()

    var animal = Animal1()
    animal.eat()
}

open class Animal1 {

    open var color: String = ""
    open fun eat() {
        println("The animal is eating")
    }
}

class Dog1 : Animal1() {
    var breed: String = ""
    override var color: String = "Black"
    fun bark() {
        println("The dog is barking")
    }
    override fun eat() {
        super<Animal1>.eat()
        println("The dog is eating")
    }
}

class Cat1 : Animal1() {
    var age: Int = 1
    fun meow() {
        println("The cat is meowing")
    }
    override fun eat() {
        super<Animal1>.eat()
        println("The cat is eating")
    }
}
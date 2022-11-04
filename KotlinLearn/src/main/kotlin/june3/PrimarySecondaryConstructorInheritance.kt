package june3

fun main(args: Array<String>) {
    var dog = Dog1("Black", "Pug")
}

open class Animal1(var color: String = "") {
    init {
        println("The animal has color $color")
    }

}

class Dog1(color: String, var breed: String) : Animal1(color) {

    init {
        println("The dog has color $color and breed $breed")
    }
}
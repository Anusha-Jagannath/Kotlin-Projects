package july24

fun main(args: Array<String>) {
    var person = Person2("Steve")
    person.display()
}

class Person2(var name: String) {

    fun display() {
        println("The name of the person is $name")
    }
}

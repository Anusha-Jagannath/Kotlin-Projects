package july22

fun main(args: Array<String>) {
    var myString = "Hello World"
    println(myString)

    var myNumber = 10
    println(myNumber)

    var myDecimal = 10.0
    println(myDecimal)

    var myString1: String
    myString1 = "Hello World"
    println(myString1)

    myString1 = "Hmm"
    display(myString1)

    var person = Person()
    person.display("steve")
}

fun display(name: String) {
    println(name)
}

class Person {

    fun display(name: String) {
        println(name)
    }
}
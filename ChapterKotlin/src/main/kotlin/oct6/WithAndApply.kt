package oct6

fun main(args: Array<String>) {

    var person = Person()

    with(person) {
        name = "Sriyank"
        age = 23
        startRun()
    }

    person.apply {
        name = "Sriyank"
        age = 23
        startRun()
    }
    person.name = "Sriyank"
    person.age = 23

    println(person.name)
    println(person.age)
}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}
package june20

fun main(args: Array<String>) {
    var person = Person()
//    person.name = "sriynak"
//    person.age = 23
//    with(person) {
//        name = "sriynak"
//        age = 23
//    }

    person.apply {
        name = "sriynak"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("I am ready to run")
    }
}
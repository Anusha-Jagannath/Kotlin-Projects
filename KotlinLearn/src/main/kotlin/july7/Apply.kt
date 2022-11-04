package july7

fun main(args: Array<String>) {
//    var person = Person()
//    person.name = "SRIYANK SIDDHARTH"
//    person.age = 26
    val person = Person().apply {
        name = "Asd"
        age = 23
    }

    with(person) {
        println(name)
        println(age)
    }
}

class Person {
    var name: String? = ""
    var age: Int? = 0
}
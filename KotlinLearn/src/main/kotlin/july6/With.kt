package july6

fun main(args: Array<String>) {
    var person = Person()
    person.nam = "sriyank siddhartha"
    person.age = 26
    println(person.nam)
    println(person.age)

    with(person) {
        println(person.nam)
        println(person.age)
    }
}

class Person {
    var nam: String? = null
    var age: Int? = null
}
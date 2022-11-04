package june27

fun main(args: Array<String>) {

    val myNumbers = listOf<Int>(2, 3, 4, 6, 23, 98)
    val smallNumbers = myNumbers.filter { n -> n < 10 }
    println(smallNumbers)

    val mapNumbers = smallNumbers.map { n -> n * n }
    println(mapNumbers)

    var people = listOf<Person>(Person(1,"kl"),Person(2,"jk"),Person(3,"ui"))
    var names = people.filter { n -> n.name.startsWith("u") }.map { n -> n.name }
    println(names)
}

class Person(var age: Int, var name: String) {

}


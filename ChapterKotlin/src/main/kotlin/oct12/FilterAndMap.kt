package oct12

fun main(args: Array<String>) {

    val myNumbers = listOf<Int>(10,20,30,40,50)

    val smallNumbers = myNumbers.filter { v -> v < 30 }

    println(smallNumbers)

    val myMap = myNumbers.map { v -> v * v }
    println(myMap)

    val filMap = myNumbers.filter { v -> v < 30 }
        .map { v -> v * v }

    println(filMap)

    val arrayList = arrayListOf<Int>()
    println(arrayList.clear())

    val people = listOf<Person>(Person("kl",20), Person("op",2), Person("io",8))

    val newPeople = people.filter { v -> v.age < 8 }
    for (p in newPeople) {
        println(p.name)
    }

    val p1 = people.filter { p -> p.name.startsWith("i") }.map { p -> p.name }
    println(p1)


}

class Person(val name: String, val age: Int) {

}
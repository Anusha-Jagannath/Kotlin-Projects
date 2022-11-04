package june28

import june27.Person

fun main(args: Array<String>) {

    val myNumbers = listOf<Int>(2, 3, 4, 6, 23, 98)
    val find: Boolean = myNumbers.all { n -> n > 10 }
    println(find)

    val any = myNumbers.any { n -> n > 10 }
    println(any)

    val count = myNumbers.count { n -> n > 10 }
    println(count)

    val find1 = myNumbers.find { n -> n > 10 }
    println(find1)


}

class Person(var age: Int, var name: String) {

}


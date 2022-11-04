package july8

import july7.Person

fun main(args: Array<String>) {
    val person: Person? = null

   val age =  person?.run {
        println(name)
        println(age)
    }

    println(age)
}
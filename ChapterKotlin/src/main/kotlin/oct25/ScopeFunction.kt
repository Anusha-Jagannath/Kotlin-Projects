package oct25

fun main(args: Array<String>) {
    //let

    //apply

    //also

    //run

    //with

    val person = Person()
    person.name = "Sriyank siddhartha"
    person.age = 23

    val person1 = Person().apply {
        name = "Sriyank"
        age = 23
    }

    //with demo
    //this
    //return value is lambda last result
    var x: String = with(person1) {
       name = "Sir"
       age = 23
        "Hello"
    }
    
    //apply
    //this
    //return context objects
    val x1: Person = person1.apply {
        name ="Sri"
        age = 23
        "Hello"
    }

    //also
    //it
    val numbersList = mutableListOf<Int>(1,2,3)
    println(numbersList)
    numbersList.add(4)
    println(numbersList)
    numbersList.removeAt(2)

    numbersList.also {
        println(it)
        it.add(4)
        println(numbersList)
        numbersList.removeAt(2)
    }

    //let
    //it
    //lambda result
    var name: String? = null
    name?.let {
        println(it.length)
    }

    //run
    //lambda result
    //this
    //combo of with let

    val person3: Person? = null
    person?.run {
        this.name = "K"
        age = 23

    }
}

class Person {
    var name: String? = null
    var age: Int? = null
}
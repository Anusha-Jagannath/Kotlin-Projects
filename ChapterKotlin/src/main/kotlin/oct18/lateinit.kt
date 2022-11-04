package oct18

fun main(args: Array<String>) {
    var c = Country()
    println(c.name)
}

class Country {

    lateinit var name: String

    fun setUp() {
        println(name.length)
    }
}
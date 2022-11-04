package june29

fun main(args: Array<String>) {
    val name: String? = "steve"
    println("The length is ${name?.length}")
    name?.let {
        println("The length is ${it.length}")
    }

    //println("The length is ${name!!.length}")

    var length = name?.length ?: -1
    println("The length is $length")
}
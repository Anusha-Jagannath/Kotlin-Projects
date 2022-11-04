package july8

fun main(args: Array<String>) {
    val name: String? = null
   val length =  name?.let {
        println(it.length)
    }
    println(length)
}
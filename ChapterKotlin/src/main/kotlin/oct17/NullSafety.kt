package oct17

fun main(args: Array<String>) {
    val name: String? = null
    val num: Int? = null

    //?.
    println(name?.length)

   //?.let
    name?.let { println(it.length) }

    //?:
    println(name?.length ?: -1)

    //!!
    println(name!!.length)

}
package may25

fun main(args: Array<String>) {
    val x: Int = 8
   val str: String =  when(x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "I don't know the value of x"
        }
    }

    println(str)
}
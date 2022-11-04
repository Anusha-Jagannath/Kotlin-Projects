package aug4

fun main(args: Array<String>) {

    val x = 0
    var str:String = when (x) {
        !in 0..1 -> {
            println("x is 1")
            "x is 1"
        }
        2 -> {
            println("x is 2")
            "x is 2"
        }
        3 -> {
            println("x is 3")
            "x is 3"
        }
        else -> {
            println("x is unknown")
            println("I don't know what is x")
            "x is unknown"
            "x is an alien"
        }
    }
    println("The string is $str")
}
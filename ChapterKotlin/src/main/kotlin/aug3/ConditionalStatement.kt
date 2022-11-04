package aug3

fun main(args: Array<String>) {

    val a = 8
    val b = 6
    var maxValue: Int = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }
    println("Maximum value is $maxValue")
}
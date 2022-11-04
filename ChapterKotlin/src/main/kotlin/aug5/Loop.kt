package aug5

fun main(args: Array<String>) {
    println("Hello")

    for (i in 1..4)
        println("Hello")

    println("While loop")
    var i = 1
    while (i < 5) {
        println("Hello")
        i++
    }

    var j = 1
    println("Do while loop")
    do {
        println("Hello")
        j++
    } while (j < 5)
}
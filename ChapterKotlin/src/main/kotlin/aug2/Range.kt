package aug2

fun main(args: Array<String>) {
    val r1 = 1..5
    println(r1)

    val r2 = 5 downTo 1

    val r3 = 5 downTo 1 step 2

    val r4 = 'a'..'z'

    var isPresent = 1 in r2

    println(isPresent)
}
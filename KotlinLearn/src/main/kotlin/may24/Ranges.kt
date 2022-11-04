package may24

fun main(args: Array<String>) {

    val r1 = 1..5
    println(r1)

    val r2 = 5 downTo 1
    println(r2)

    val r3 = 1..5 step 2

    val r4 = 'a'..'z'
    val isPresent = 'c' in r4
    println(isPresent)

    var downTo = 10.downTo(1)
    var moveUp = 1.rangeTo(10)
}


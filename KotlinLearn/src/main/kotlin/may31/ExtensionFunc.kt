package may31

fun main(args: Array<String>) {
    val s1 = "hello"
    val s2 = "world"
    val s3 = "may"
    println(s1 + s2 + s3)
    println(s1.add(s2, s3))

    val x = 2
    val y = 3
    val greaterNumber = x.greaterValue(y)
    println(greaterNumber)
}

fun String.add(s2: String, s3: String): String {
    return this + s2 + s3
}

fun Int.greaterValue(secondNumber: Int): Int {
    return if (secondNumber > this) {
        secondNumber
    } else {
        this
    }
}
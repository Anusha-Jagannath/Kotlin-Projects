package aug22

fun main(args: Array<String>) {
    val result = findVolume(2,3, 5)
    println(result)
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int {
    return length * breadth * height
}
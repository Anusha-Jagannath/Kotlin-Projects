package may31

fun main(args: Array<String>) {
    val result = findVolume(2,3)
    println(result)
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 20): Int {
    return length * breadth * height
}
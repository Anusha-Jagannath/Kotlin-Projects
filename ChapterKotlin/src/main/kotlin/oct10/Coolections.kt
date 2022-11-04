package oct10

fun main(args: Array<String>) {

    val myArray = Array<Int>(5) { 0 }
    myArray[0] = 1 //mutable but has fixed size
    myArray.forEach {
        println(it)
    }

    for (i in myArray.indices) {
        println(myArray[i])
    }
}
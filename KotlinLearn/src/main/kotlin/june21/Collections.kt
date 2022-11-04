package june21

fun main(args: Array<String>) {

    var myArray = Array<Int>(5) { 0 }
    for (i in myArray) {
        println(i)
    }

    for(index in myArray.indices) {
        println(index)
    }
}
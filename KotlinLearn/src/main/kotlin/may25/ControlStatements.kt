package may25

//fun main(args: Array<String>) {
//    val a = 2
//    val b: Int = 3
//    val maxValue: Int
//    if(a > b) {
//        maxValue = a
//    }
//
//    else {
//        maxValue = b
//    }
//
//    println("Maximum value is $maxValue")
//}

fun main(args: Array<String>) {
    val a: Int =2
    val b: Int = 5
    val maxValue = if(a > b) {
        a
        println("$a is greater")
    }
    else {
        b
        println("$b is greater")
    }
    println("maxvalue is $maxValue")
}
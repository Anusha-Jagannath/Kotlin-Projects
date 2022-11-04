package may30

fun main(args: Array<String>) {
    val largeValue = max(2,4)
    println(largeValue)
}

//fun max(a: Int,b: Int): Int {
//    if(a > b) return a
//    else return b
//}

//fun max(a: Int, b: Int) = if(a > b) a else b

fun max(a: Int, b: Int) =
    if (a > b) {
        println("$a is greater")
        a
    }
     else {
         println("$b is greater")
        90
     }
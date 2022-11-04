package may24

//fun main(args: Array<String>) {
//    var name = "Sam"
//    var str = "Hello $name"
//    println(str)
//    println("The statement is ${str.length}")
//
//    val a = 10
//    val b = 20
//    println("The sum of $a and $b is ${a + b}")
//}

fun main(args: Array<String>) {
    var r = Rectangle()
    println("The area of rectangle whose length is ${r.length} and breadth is ${r.breadth} is ${r.length * r.breadth}")
}

class Rectangle {
    var length: Int = 5
    var breadth: Int = 10
}
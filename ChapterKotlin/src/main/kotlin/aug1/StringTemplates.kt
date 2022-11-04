package aug1

fun main(args: Array<String>) {

    val name: String = "sam"
    val str: String = "Hello $name"
    println("The statement is ${str.length}")

    val a = 2
    val b = 3
    println("The sum of $a and $b is ${a + b}")

    var rectangle = Rectangle()
    rectangle.length = 5
    rectangle.breadth = 3
    println("The length of rectangle is ${rectangle.length} and breadth of rectangle is ${rectangle.breadth}. The area is ${rectangle.length * rectangle.breadth}")
}

class Rectangle {

    var length: Int = 0
    var breadth: Int = 0

}
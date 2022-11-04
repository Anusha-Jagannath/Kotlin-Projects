package june14

//enum class Color(shade: String) {
//    RED("red color"),
//    GREEN("green color"),
//    BLUE("blue color")
//}

sealed class Shape {
    class Circle(var radius: Double) : Shape()
    class Square(var side: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
    object NotShape: Shape()
}

fun main(args: Array<String>) {
    var circle = Shape.Circle(0.02)
    var square = Shape.Square(2)
    var rectangle = Shape.Rectangle(2, 3)
    var notShape = Shape.NotShape

    checkShape(circle)
    checkShape(notShape)

}

fun checkShape(shape: Shape) {
    when(shape) {
        is Shape.Circle -> println("Area of a circle is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Area of a square is ${shape.side * shape.side}")
        is Shape.Rectangle -> println("Area of a rectangle is ${shape.length * shape.breadth}")
        Shape.NotShape -> println("not a shape")
    }
}


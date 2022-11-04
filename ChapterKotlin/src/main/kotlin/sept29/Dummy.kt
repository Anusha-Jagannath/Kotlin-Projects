package sept29

fun main(args: Array<String>) {
    var circle = Shape.Circle(3F)
    var rectangle = Shape.Rectangle(2F, 3F)
    var notShape = Shape.NotShape

    checkShape(rectangle)
    checkShape(notShape)

}

sealed class Shape {
    data class Circle(var radius: Float) : Shape()
    class Square(var side: Float) : Shape()
    class Rectangle(var length: Float, var breadth: Float) : Shape()
    object NotShape : Shape()
}

fun checkShape(shape: Shape) {
    when (shape) {
        is Shape.Circle -> println("The are of circle is ${3.14 * shape.radius * shape.radius}")
        is Shape.Rectangle -> println("The area of rectangle is ${shape.length * shape.breadth}")
        is Shape.Square -> println("The area of square is ${shape.side * shape.side}")
        Shape.NotShape -> println("Not a shape at all")
    }
}
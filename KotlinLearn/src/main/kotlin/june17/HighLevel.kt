package june17

fun main(args: Array<String>) {
    var program = Program()
    var result = 0
    var myLambdaFunc: (Int, Int) -> Unit = { x, y -> result = x + y }
    program.addTwoNumbers(2, 3, myLambdaFunc)
    println(result)

}

class Program {
    fun addTwoNumbers(c: Int, d: Int, action: (Int, Int) -> Unit) {
        action(c, d)

    }
}
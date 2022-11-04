package oct4

fun main(args: Array<String>) {
    val program = Program()
    var result = 0
    program.addTwoNumbers(2, 3, { a: Int, b: Int -> result = a + b })
    println(result)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
        val result = action(2, 3)
        println(result)
    }
}
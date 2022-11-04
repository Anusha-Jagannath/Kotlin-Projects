package oct4

fun main(args: Array<String>) {
    val program1 = Program1()
    program1.reverseAndDisplay("Hello") { str -> str.reversed() }
}

class Program1 {

    fun reverseAndDisplay(str: String, action: (String) -> String) {
        val result = action(str)
        println(result)
    }
}
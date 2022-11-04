package sept30

fun main(args: Array<String>) {

    var program = Program()
    program.addTwoNumbers(2,3) //simple way..
}

class Program {

    fun addTwoNumbers(a: Int, b: Int) { //simple way
        val sum = a + b
        println("The sum is $sum")
    }
}

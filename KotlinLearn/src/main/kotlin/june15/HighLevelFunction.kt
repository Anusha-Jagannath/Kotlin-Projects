package june15

fun main(args: Array<String>) {
    val program = Program()
    program.addTwoNumbers(2,3)
    program.addNumbers(2,7, object: MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    val myLambda: (Int) -> Unit = { s: Int-> println(s) }
    program.addNumbersLambda(2,3,myLambda)
}

class Program {

    fun addNumbersLambda(a: Int, b: Int,action: (Int) -> Unit) {
        val sum = a + b
        action(sum)
    }

    fun addNumbers(a: Int,b: Int,action: MyInterface) {
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {

    fun execute(sum: Int)
}
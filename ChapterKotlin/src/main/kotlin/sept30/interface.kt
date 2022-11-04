package sept30

fun main(args: Array<String>) {
    var program = Program1()
    program.addTwoNumbers(2,3, object: MyInterface {
        override fun execute(a: Int, b: Int) {
            val sum = a + b
            println("The sum is $sum")
        }

    })
}

class Program1 {

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) { //simple way
       action.execute(a,b)
    }
}

interface MyInterface {
    fun execute(a: Int, b: Int)
}

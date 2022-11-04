package sept30

fun main(args: Array<String>) {

    val program = Program2()
    program.addTwoNumber(2,3, {sum -> println(sum)})


}

class Program2 {
    fun addTwoNumber(a: Int, b: Int, myLambda: (Int) -> Unit) {
        val sum = a + b
        myLambda(sum)
    }
}
package june17

fun main(args: Array<String>) {
    val program = Program4()
   // val myLambdaFunc: (String) -> String = {s -> s.reversed()}
    val myLambdaFunc: (String) -> String = {it.reversed()}
    program.reverseAndDisplay("helloworld",myLambdaFunc)
}

class Program4 {

    fun reverseAndDisplay(str: String, action:(String) -> String) {
        action(str)
    }
}
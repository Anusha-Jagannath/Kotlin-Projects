package june16


fun main(args: Array<String>) {

    var program = Program1()
    val myLambdaFunc: (Int, Int) -> Int = { x, y -> x + y }
    program.addTwoNumbers(2,3) { x, y -> x + y }
}

class Program1 {

    fun addTwoNumbers(a:Int,b:Int,myLambdaFunc:(Int,Int) -> Int) {
        println(myLambdaFunc(a,b))
    }
}

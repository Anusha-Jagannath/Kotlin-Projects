package oct3

fun main(args: Array<String>) {

    addTwoNumbers4(2, 3) { x, y -> x + y }

}

fun addTwoNumbers4(a: Int, b: Int, action: (Int, Int) -> Int) {
    var result = action(a, b)
    println(result)
}

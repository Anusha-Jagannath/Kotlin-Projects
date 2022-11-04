package june1

fun main(args: Array<String>) {

    val x: Int = 2
    val y:Int = 4
    val greater = x.greaterValue(y)
    println(greater)
}

infix fun Int.greaterValue(secondNo: Int): Int {
    if(this > secondNo) return this else return secondNo
}

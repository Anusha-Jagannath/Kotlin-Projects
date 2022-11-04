package may26

fun main(args: Array<String>) {
    var i: Int = 0
    while(i < 5) {
        println(i)
        i++
    }

    var start: Int = 1
    while( start <= 10) {
        if( start % 2 == 0)
            println(start)
        start++
    }
}
package aug9

//fun main(args: Array<String>) {
//     var i = 0
//
//    while (i <= 10){
//       if (i % 2 == 0) {
//           println(i)
//       }
//        i++
//    }
//}

fun main(args: Array<String>) {
    println("Hello")

    var (a,b) = Pair(1,2)
    println("$a $b")

    var name = Pair("anu","kl")
    println(name.first)
    println(name.second)

    var name1 = Triple(1,2,3)
    println(name1.first)
    println(name1.second)
    println(name1.third)
}
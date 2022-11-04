package may27

//fun main(args: Array<String>) {
//    for(i in 1..10) {
//        println(i)
//        if(i == 5)
//            break
//    }
//}

//fun main(args: Array<String>) {
//    for( i in 1..3) {
//        for(j in 1..3) {
//            println("$i $j")
//            if(i == 2 && j == 2)
//                break
//        }
//    }
//}

fun main(args: Array<String>) {
    myLoop@ for( i in 1..3) {
        for(j in 1..3) {
            println("$i $j")
            if(i == 2 && j == 2)
                break@myLoop
        }
    }
}
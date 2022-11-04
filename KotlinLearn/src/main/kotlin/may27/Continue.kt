package may27

//fun main(args: Array<String>) {
//    for(i in 1..10) {
//        println(i)
//    }
//}

//fun main(args: Array<String>) {
//    for( i in 1..10) {
//        if(i == 5)
//            continue
//        println(i)
//    }
//}

//fun main(args: Array<String>) {
//    for( i in 1..10) {
//        if(i % 2 == 0)
//            continue
//        println(i)
//    }
//}

fun main(args: Array<String>) {

    any@ for ( i in 1..3) {
        for(j in 1..3) {
            if(i == 2 && j ==2)
                continue@any
            println("$i $j")
        }
    }
}
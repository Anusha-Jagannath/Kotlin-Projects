package oct13

fun main(args: Array<String>) {

    val myNumbers = listOf<Int>(2,3,4,6,7,8)

    val check1 = myNumbers.all { num -> num > 5}
    println(check1)

    val check2 = myNumbers.any { num -> num > 5 }
    println(check2)

    val check3 = myNumbers.count { num -> num > 5 }
    println(check3)

    val check4 = myNumbers.find { num -> num > 10 }
    println(check4)
    
    val myPredicate = {num: Int -> num > 10}

}
package july7

fun main(args: Array<String>) {
    val numbersList = mutableListOf<Int>(1,2,3)
   val duplicateNumbers =  numbersList.also {
        println("The list is $numbersList")
        numbersList.add(4)
        println("The list is $numbersList")
        numbersList.remove(2)
        println("The list is $numbersList")
    }

    println("The original numbers $numbersList")
    println("The duplicate numbers $duplicateNumbers")
}


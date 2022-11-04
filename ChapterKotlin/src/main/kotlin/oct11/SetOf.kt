package oct11

fun main(args: Array<String>) {

    val set1 = setOf<Int>(1,2,3,4,1)
    for (i in set1) {
        println(i)
    }

    val set2 = mutableSetOf<Int>()
    set2.add(1)
    set2.add(2)
    set2.add(3)
    set2.add(10)
    println(set2)

    val set3 = hashSetOf<Int>()
    set3.add(10)
    set3.add(20)
    set3.add(3)
    set3.add(1)
    println(set3)
}
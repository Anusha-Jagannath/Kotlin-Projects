package june24

fun main(args: Array<String>) {
    var mySet = setOf<Int>(2,54,3,1,0,9,9,9,8)

    var newSet = mutableSetOf<Int>(2,54,3,1,0,9,9,9,8)
    newSet.remove(54)
    for(element in newSet) {
        println(element)
    }

    var hashSet = hashSetOf<Int>(2,54,3,1,0,9,9,9,8)
    for(element in hashSet) {
        println(element)
    }
    println(mySet)
}
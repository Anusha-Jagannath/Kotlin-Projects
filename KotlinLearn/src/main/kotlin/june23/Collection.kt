package june23

fun main(args: Array<String>) {

    var myMap1 = mapOf<Int,String>()
    var myMap = mapOf<Int,String>(1 to "y",2 to "h",3 to "g")

    for(key in myMap.keys) {
        println("Element at key $key is ${myMap[key]}")
    }
}
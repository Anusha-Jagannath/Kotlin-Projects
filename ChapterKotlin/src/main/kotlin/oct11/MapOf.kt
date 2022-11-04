package oct11

fun main(args: Array<String>) {

    val mapOf = mapOf<Int, String>(2 to "Yogi",3 to "Manmohan", 4 to "Vajpayee")


    //mutable map
    //both read and write
    val map2 = hashMapOf<Int, String>()
    map2[6] = "Yogi"
    map2[3] = "Manmohan"



    map2.forEach {
        println(it.value)
    }
}
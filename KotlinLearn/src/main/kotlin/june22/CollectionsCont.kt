package june22

fun main(args: Array<String>) {
    var list = listOf<String>("yoga","dance","safari")
    for (l in list) {
        println(l)
    }

    var mList = mutableListOf<String>("as","df","io")
    mList.add("lo")
    mList.removeAt(1)
    mList.add(1,"ui")

    for (l in mList) {
        println(l)
    }
}
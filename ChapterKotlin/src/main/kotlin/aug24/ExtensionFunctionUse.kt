package aug24

fun main(args: Array<String>) {
    var str1 = "Hello"
    var str2 = "World"
    var str3 = "Hop"
    //str3 = str1+str2+str3
    println(str3.add(str1,str2))
}



fun String.add(str1: String, str2: String): String {
    return str1+str2+this
}


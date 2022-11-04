package aug25


//can be a member function or extension function incase of kotlin
//have single parameter
//have a prefix infix

//all infix expressions are extension function but vice versa is not true
fun main(args: Array<String>) {
    var st1 = "Hello"
    var str2 = "world"
    var str3 = "Hey"

    var a: Int = 2
    var b: Int = 3
    println("The greater number is ${a.greaterNumber(b)}")
    var result = a greaterNumber b
    println("The greater number using infix expression is $result")

}
fun String.append(str1: String, str2: String): String { //cannot be infix function, its only extension function
    return this+str1+str2
}

infix fun Int.greaterNumber(b: Int):Int { //infix function and extension function
    return if (this > b) this else b
}

//benefit of infix function
//calling the method becomes easy
//we can simply use x greater y
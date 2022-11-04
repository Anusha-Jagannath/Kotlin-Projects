package aug24

fun main(args: Array<String>) {
    var x = 6
    var y = 10
    var greaterValue = x.greaterNumber(y)
    println(greaterValue)

}

fun Int.greaterNumber(y: Int): Int {
    if (this>y)
        return this
    else
        return y
}

//Advantages of using extension functions
//They can become part of your own class eg Student, employee, User etc ( Custom Class )
//They can become part of any predefine class like String, Integer, Array, Char or any other predefined class in the kotlin
// Simply reduces the code and makes your code cleaner and much easier to read
//You don't have to modify the old classes or predefined classes for just adding some functions
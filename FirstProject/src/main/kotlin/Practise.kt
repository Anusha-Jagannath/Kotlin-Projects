const val STRING_CONSTANT = "I am a constant"  //public static final
const val DEFAULT_NICK_NAME = "Nick"
fun main(){
//    println("Hello")
//    print(STRING_CONSTANT)
//    var person1 = Person("Nickson", 14)
//    person1.description()
    //difference between normal val and const..you cannot change and create compile time const makes code more efficient
    //val run time
    //const val is immutable
    //const val is top level

    var age = 10
    var age1:Int = 10;
    val isAlive:Boolean = true
    // not supported isAlive = false
    //var is mutable
    //val is immutable
     var student1 = Student("hita")
    println(age)

    val items = mutableListOf<String>("apple","orange")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

}
class Person(var name:String,var age:Int,val nickname:String = DEFAULT_NICK_NAME){
    fun description(){
        print("Name: $name,Age: $age,nickname: $DEFAULT_NICK_NAME")
    }
}

class Student(var name: String) {
    //body
    var name1:String = name
    init {
        //your class initializer
        println()
    }
}

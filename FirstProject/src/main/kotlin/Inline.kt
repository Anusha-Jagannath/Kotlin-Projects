//fun main(){
//    println("Hello".formattedString())
//}
//fun String.formattedString() : String {
//    return "$this----"
//}
//fun main() {
//    calculateTime {
//        calculateTime {
//            loop(100)
//        }
//    }
//}
//
//inline fun calculateTime(fn: () -> Unit) {  //performance benefit
//    val start: Long = System.currentTimeMillis()
//    fn()
//    val end: Long = System.currentTimeMillis()
//    println("Time taken ${start - end}")
//}
//
//fun loop(n: Int) {
//    for (i in 1..n) {
//        print("Hello")
//    }
//}

//inline function cross inline no inline function
//declared using keyword inline
//fun main(){
//    inlineFunction { println("calling inline function") }
//}
//
//inline fun inlineFunction(fn: () -> Unit){
//    fn()
//    println("code inside inline function")
//}

//high level function
//extension function --> add functions to a class without declaring it
//new functions behaves like static

//fun main() {
//    var student = Student1()
//    println("Pass status : "+student.hasPassed(57))
//    println("Scholorship status : "+student.isScholor(57))
//}
//
//fun Student1.isScholor(marks: Int): Boolean {
//    return marks > 95
//}
//
//class Student1 {
//    fun hasPassed(marks: Int): Boolean {
//        return if(marks > 40)
//            true
//        else
//            false
//    }
//}

//fun main(){
//    var s1 = "Hello"
//    var s2 = "World"
//    var s3 = "hey"
//    println(s3.add(s1,s2))
//}
//
//fun String.add(s1:String,s2:String):String {
//    return this + s1 + s2
//}
//they can become part of own class or predefined classes
//you don't have to modify existing class for adding new function

//interface in kotlin
//interface Person1 { //you cannot create instance of interface
//    var name:String  //abstract and open by default
//    fun eat()  //open and public abstract
//}
//
//class Student2 : Person1 {
//
//    override var name: String ="sima"
//    override fun eat() {
//        println("Sima is eating")
//    }
//}
//
//fun main() {
//    var s = Student2()
//    s.eat()
//}

//scope functions
// 5 types with,let,run,apply,also
class Person3 {
    var name:String = "yagnik"
    var age:Int = 5
}

fun main(){
  //var per = Person3()
//    per.name = "Yagnik"
//    per.age = 30

//    var per = Person3().apply {
//        name = "Yagnik"
//        age = 30             //makes ur code clear and concise
//    }
//   val ageAfterFiveYears: Int =  with(per){
//        println(this.name)
//        println(this.age)
//        this.age + 5
//    }
//
//    var per = Person3().apply {
//        name = "Yani"
//        age = 20
//    }

    var list = mutableListOf(1,2,3)
    println(list)
    list.add(4)
    list.remove(1)


    list.also {
        println(list)
        list.add(4)
        list.remove(1)
    }

}
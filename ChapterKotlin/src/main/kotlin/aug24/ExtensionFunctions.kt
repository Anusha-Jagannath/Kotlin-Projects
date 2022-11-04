package aug24

fun main(args: Array<String>) {
    //extension function is adding extra function to existing class without declaring it inside the class
    //new functions just behave like static function in case of java

    var student = Student()
    var result = student.hasPassed(95)
    var scholor = student.isScholar(95)
    println("The student of the student is $result")
    println("The student is scholor is $scholor")

}
class Student { //OUR OWN CLASS WE ARE THE OWNER OF THE CLASS

    fun hasPassed(marks: Int): Boolean {
        return marks >= 40
    }
}

fun Student.isScholar(marks: Int): Boolean {
    return marks>=95
}
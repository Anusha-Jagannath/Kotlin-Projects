package july23

fun main(args: Array<String>) {
    var student = Student()
    student.name = "Steve"
    println("The name of the person ${student.name}")
}

class Student {
    var name: String = ""
}
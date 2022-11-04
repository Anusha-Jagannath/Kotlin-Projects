package june1

//fun main(args: Array<String>) {
//    var student = Student()
//    student.name = "sriyank"
//    println("The student has got the name as ${student.name}")
//}
//
//class Student {
//    var name: String = ""
//
//}



//fun main(args: Array<String>) {
//    var student = Student("sriyank")
//}
//
//class Student(name: String) {
//
//    init {
//        println("The student has got the name of $name")
//    }
//}

//fun main(args: Array<String>) {
//    var student = Student("sriyank")
//    println("The studnet from main block got the name as ${student.name}")
//}
//
//
//class Student(name: String) {
//    var name: String = "dummy"
//    init {
//        this.name = name
//        println("Student from init block has got the name as $name")
//    }
//
//}

fun main(args: Array<String>) {
    var student = Student("sriyank")
    println("The studnet from main block got the name as ${student.name}")
}


class Student(var name: String) {
    init {
        println("Student from init block has got the name as $name")
    }

}
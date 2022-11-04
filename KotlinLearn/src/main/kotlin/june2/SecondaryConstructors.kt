package june2

fun main(args: Array<String>) {
    var student = Student("sriyank",10)
    println(student.name)
    println(student.id)
}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("The student has got the name as $name")
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}
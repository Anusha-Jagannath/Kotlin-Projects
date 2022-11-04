package aug30

fun main(args: Array<String>) {
    var student = Student("sriyank",10)
    student.id = 10
    println(student.id)

}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("Student has got the name $name and id $id")
    }

    constructor(name: String,id: Int) : this(name) {
        //the body of secondary constructor is called after the init block
        this.id = id
    }
}
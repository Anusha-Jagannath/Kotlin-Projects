package oct22

fun main(args: Array<String>) {
    var human = Human()
    human.age = 45
    println(human.age)

    var student = Student()
    student.addHobby("Cricket")
}

class Human {

    private var _age: Int = 0
    var age: Int
        get() {
            return _age
        }
        set(value) {
            _age = value
        }
}

class Student {

    private var _hobbies = mutableListOf<String>()
    val hobbies: List<String>
        get() {
           return _hobbies
        }

    fun addHobby(hobby: String) {
        _hobbies.add(hobby)
    }
}
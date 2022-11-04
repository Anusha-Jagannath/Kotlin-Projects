package oct20


fun main(args: Array<String>) {
    var human = Human()
    human.age = 10
    println(human.age)

    var student = Student()
    student.addHobbies("Cricket")

    //student.hobbies.remove("Cricket")
}
class Human {
    private var _age: Int = 0 //backing property
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
            return hobbies
        }

    fun addHobbies(hobby: String) {
        _hobbies.add(hobby)
    }

}
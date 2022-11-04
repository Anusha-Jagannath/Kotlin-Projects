package may31

fun main(args: Array<String>) {
    val marks = 57
    val person = Person()
    println("The person with marks $marks ${person.hasPassedExamination(marks)}")
}

class Person {

    fun hasPassedExamination(marks: Int): Boolean {
       return marks > 40
    }
}
package sept13th

fun main(args: Array<String>) {
  var person = Indian()
    person.eat()
}

abstract class Person {
    abstract var name: String
    abstract fun eat()
    open fun getHeight() {}
    fun goToSchool() {} //functions are by default public and final in nature
}

class Indian: Person() {

    override fun getHeight() {

    }

    override var name: String = "dummy_namer"


    override fun eat() {

    }
}
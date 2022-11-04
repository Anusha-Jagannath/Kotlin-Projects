package june6

fun main(args: Array<String>) {

}
abstract class Person {

    abstract var name: String
    open fun goToSchool() {}
    open fun getHeight() {}
    abstract fun eat()
}

class Indian: Person() {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}


    override fun goToSchool() {}
    override fun getHeight() {
        super.getHeight()
    }

    override fun eat() {
        TODO("Not yet implemented")
    }


}
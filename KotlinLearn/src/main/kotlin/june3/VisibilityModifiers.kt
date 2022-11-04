package june3


open class Person {
    private val age: Int = 0
    protected val b = 2
    internal val e = 4
    val c = 10
}

class Indian: Person() {
   //age is not visibile
    //b is visible
}

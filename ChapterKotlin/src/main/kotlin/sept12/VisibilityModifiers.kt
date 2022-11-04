package sept12

fun main(args: Array<String>) {
    var a = " "
    println(a.length)
}

fun run() {} //by default public in nature

//class Person {} //by default public in nature

open class Person {
    private val a = 1;
    protected val b = 2;
    internal val c = 3;
    public val d = 4;
}

class Indian: Person() {
    //a is not visible in Indian class
    //b can be accessed
    //c can be accessed
    //d can be accessed

    fun test() {
        println(d)
        println(c)
        println(b)
        //println(a)
    }
}

class Test {
    fun testing() {
        var person = Person()
        println(person.c)
        println(person.d)
    }
}
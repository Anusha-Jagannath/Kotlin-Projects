package sept26

fun main(args: Array<String>) {
    Customer.Id = 100
    Customer.registerCustomer()
    println(Customer.Id)
    println(Customer.registerCustomer())
}

open class MySuperClass {

    fun myMethod(str: String) {
        println("My super class")
    }
 }

object Customer: MySuperClass() {
    var Id: Int = -1  //behaving as static variable
    fun registerCustomer() { //behaving static
        println("Inside register")
    }

}
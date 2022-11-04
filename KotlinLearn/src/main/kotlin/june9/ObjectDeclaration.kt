package june9

fun main(args: Array<String>) {
    Customer.count = 20
    Customer.getCustomerType()
    Customer.myMethod("Hai")
}

open class MyClass {

    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object Customer: MyClass() {
    var count: Int = -1

    fun getCustomerType(): String {
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
    }


}
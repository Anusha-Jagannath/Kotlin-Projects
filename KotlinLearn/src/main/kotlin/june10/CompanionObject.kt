package june10

fun main(args: Array<String>) {

    MyClass.id
    MyClass.getCustomerType()
}

class MyClass {
    companion object {
        var id: Int = -1
        fun getCustomerType(): String {
            return "Indian"
        }
    }
}
package sept28

fun main(args: Array<String>) {
    CustomerObject.id
    CustomerObject.getCustomerData()
}

class CustomerObject {
    companion object {
        var id: Int = -1

        fun getCustomerData(): String {
            return "Indian"
        }
    }
}
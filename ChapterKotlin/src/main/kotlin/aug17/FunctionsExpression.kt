package aug17

fun main(args: Array<String>) {
    val platinum: CreditCardType = CreditCardType.PLATINUM
}

fun maxOfTwoNumbers(a:Int, b: Int) {
    if (a > b)  a
    else b
}

enum class CreditCardType {
    SILVER,
    GOLD,
    PLATINUM
}
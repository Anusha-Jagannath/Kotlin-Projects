package june13th

enum class CreditCardType {
    SILVER,
    GOLD,
    PLATINUM
}


fun main(args: Array<String>) {
    var gold = CreditCardType.GOLD
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.name)
    println(CreditCardType.GOLD)

    var myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach {
        println(it)
    }

    when(gold) {
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }
}

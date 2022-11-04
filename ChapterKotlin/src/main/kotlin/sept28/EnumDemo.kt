package sept28

fun main(args: Array<String>) {
    val myCardType: CreditCardType = CreditCardType.SILVER

    /*
    each constant can be accessed using both ordinal and name
     */

    println(CreditCardType.PLATINUM.ordinal)
    println(CreditCardType.PLATINUM.name)

    /* Each enum object has value and valuesOf method*/

    var values: Array<CreditCardType> = CreditCardType.values()
    values.forEach {
        println(it)
    }

    when (myCardType) {
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold type card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }

}


enum class CreditCardType {
    SILVER,
    GOLD,
    PLATINUM
}
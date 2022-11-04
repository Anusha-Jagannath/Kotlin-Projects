package sept28

fun main(args: Array<String>) {
    println(CreditCard.SILVER.color)
    println(CreditCard.SILVER.maxLimit)
    println(CreditCard.PLATINUM.color)
    println(CreditCard.PLATINUM.maxLimit)

    CreditCard.GOLD.getCashBack()
}

enum class CreditCard(val color: String, val maxLimit: Int = 10): ICardCashBack {
    SILVER("silver",1) {
        override fun getCashBack(): Int {
            return 1
        }
    },
    GOLD("gold",2) {
        override fun getCashBack(): Int {
           return 2
        }
    },
    PLATINUM("silver") {
        override fun getCashBack(): Int {
          return 3
        }
    }
}

interface ICardCashBack {
    fun getCashBack(): Int
}
package june13th

interface ICashBack {
    fun getCashBack(): Float
}

enum class CreditCard(val color: String, val maxLimit: Int): ICashBack {
    SILVER("silver",1) {
        override fun getCashBack(): Float {
           return 500F
        }
    },
    GOLD("gold",2) {
        override fun getCashBack(): Float {
          return 1000F
        }
    },
    PLATINUM("platinum",3) {
        override fun getCashBack(): Float {
           return 1500.0F
        }
    }
}

fun main(args: Array<String>) {
    println(CreditCard.GOLD.color)
    println(CreditCard.GOLD.maxLimit)
    println(CreditCard.GOLD.getCashBack())
}
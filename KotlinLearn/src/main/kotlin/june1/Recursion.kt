package june1

import java.math.BigInteger

fun main(args: Array<String>) {
    val n: Int = 6
    val result = getFibonacci(8, BigInteger("0"),BigInteger("1"))
    println("The fibonacci number at position is $n is $result")
}

tailrec fun getFibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if(n==0) return b
    else
        return getFibonacci(n-1,a+b,a)
}
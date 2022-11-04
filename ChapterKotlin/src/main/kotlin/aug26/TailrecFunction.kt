package aug26

import java.math.BigInteger

fun main(args: Array<String>) {
    //tailrec function optimizes recursion code compared to any other language
    //recursion means calling a function again and again
    //kotlin simply avoids stack overflow error

    //code to find fibonacci series
     println(getFibonacciNumberRec(100, BigInteger("1"),BigInteger("0")))
}

fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) return b
    else return getFibonacciNumber(n - 1, a + b, a)
}

tailrec fun getFibonacciNumberRec(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) return b
    else return getFibonacciNumberRec(n - 1, a + b, a)
}
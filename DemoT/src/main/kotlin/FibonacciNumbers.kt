object FibonacciNumbers {

    fun getFibonacci(n: Int): Long {
        if (n == 0 || n == 1)
            return n.toLong()
        var a = 0L
        var b = 1L
        var c = 1L
        for (i in 2 until n) {
            c = a + b
            a = b
            b = c
        }
        return c
    }

    fun checkBraces(s: String): Boolean {
        return s.count {it == '('} == s.count{it == ')'}
    }
}
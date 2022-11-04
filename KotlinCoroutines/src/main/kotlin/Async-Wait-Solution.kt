import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {

    GlobalScope.launch(Dispatchers.IO) {
        var time = measureTimeMillis {
            val answer1 = async { networkCall5() }
            val answer2 = async { networkCall6() }
            println("Answer is ${answer1.await()}")
            println("Answer is ${answer2.await()}")
        }
        println("Time taken for executing both functions $time ms")
    }
    Thread.sleep(3000)

}
suspend fun networkCall5(): String {
    delay(1000)
    return "Answer1"
}

suspend fun networkCall6(): String {
    delay(1000)
    return "Answer2"
}


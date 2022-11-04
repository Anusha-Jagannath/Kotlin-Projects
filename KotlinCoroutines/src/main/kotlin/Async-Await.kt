import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch(Dispatchers.IO) {
        val answer1 = networkCall1()
        val answer2 = networkCall2()
        println("Answer 1 is $answer1")
        println("Answer 2 is $answer2")
    }
    Thread.sleep(3000)
}

suspend fun networkCall1(): String {
    delay(1000)
    return "Answer1"
}

suspend fun networkCall2(): String {
    delay(1000)
    return "Answer2"
}
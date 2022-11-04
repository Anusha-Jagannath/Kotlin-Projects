import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    runBlocking {
        println("Main program starts here ${Thread.currentThread().name}")
        GlobalScope.launch {
            println("Thread works starts here ${Thread.currentThread().name}")
            myDelay(1000)
            println("Thread works ends here ${Thread.currentThread().name}")
        }
        myDelay(2000)
        println("Main program ends here ${Thread.currentThread().name}")
    }
}

suspend fun myDelay(time: Long) {
    delay(time)
}
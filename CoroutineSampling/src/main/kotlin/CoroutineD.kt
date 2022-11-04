import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    runBlocking {
        println("Main program starts here ${Thread.currentThread().name}")
        GlobalScope.launch {
            println("fake work starts here ${Thread.currentThread().name}")
            mySuspendFunc(1000)
            println("fake work finished here ${Thread.currentThread().name}")
        }
        mySuspendFunc(2000)
        println("Main program ends here ${Thread.currentThread().name}")
    }
}

suspend fun mySuspendFunc(time: Long) {
    //code
    delay(time)
}
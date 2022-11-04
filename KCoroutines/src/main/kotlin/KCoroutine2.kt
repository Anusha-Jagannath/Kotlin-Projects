import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    println("Main program starts here ${Thread.currentThread().name}")
    GlobalScope.launch {
        println("Current thread name ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Current work finished ${Thread.currentThread().name}")
    }
    Thread.sleep(2000)
    println("Main program ends here ${Thread.currentThread().name}")
}
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {  //exceutes in main thread
    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {  //creates background coroutine
        println("Work in background thread starts: ${Thread.currentThread().name}")
        //Thread.sleep(1000) //1 seconds work //delay(1000) is better
        delay(1000)
        println("Background work finished: ${Thread.currentThread().name}")
    }
    //Thread.sleep(3000)

    println("Main program ends: ${Thread.currentThread().name}")
}
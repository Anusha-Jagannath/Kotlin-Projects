import kotlin.concurrent.thread

fun main() {  //exceutes in main thread
    println("Main program starts: ${Thread.currentThread().name}")
    thread {
        println("Work in background thread starts: ${Thread.currentThread().name}")
        Thread.sleep(1000) //1 seconds work
        println("Background work finished: ${Thread.currentThread().name}")
    }
    println("Main program ends: ${Thread.currentThread().name}")
}
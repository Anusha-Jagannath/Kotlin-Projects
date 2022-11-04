import kotlin.concurrent.thread

fun main(args: Array<String>) {
    println("Main program starts here ${Thread.currentThread().name}")
    thread {
        println("Current thread name ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Current work finished ${Thread.currentThread().name}")
    }
    println("Main program ends here ${Thread.currentThread().name}")
}
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    println("Main program starts here ${Thread.currentThread().name}")
    thread {
        println("fake work starts here ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("fake work finished here ${Thread.currentThread().name}")
    }
    println("Main program ends here ${Thread.currentThread().name}")
}
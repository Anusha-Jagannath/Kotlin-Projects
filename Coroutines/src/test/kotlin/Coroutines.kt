import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

//fun main() {
//    println("Main program starts: ${Thread.currentThread().name}")
//    thread {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("fake work finished: ${Thread.currentThread().name}")
//    }
//
//    println("Main program ends: ${Thread.currentThread().name}")
//}


fun main() {
    println("Main program starts: ${Thread.currentThread().name}")
    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("fake work finished: ${Thread.currentThread().name}")
    }

    println("Main program ends: ${Thread.currentThread().name}")
}
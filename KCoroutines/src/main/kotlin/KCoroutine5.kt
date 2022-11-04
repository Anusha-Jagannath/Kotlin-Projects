import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {

    runBlocking {

        println("Main program starts here ${Thread.currentThread().name}")
        GlobalScope.launch {
            println("Current thread name ${Thread.currentThread().name}")
            delay(1000)
            println("Current work finished ${Thread.currentThread().name}")
        }
        delay(2000)

        println("Main program ends here ${Thread.currentThread().name}")


    }
}
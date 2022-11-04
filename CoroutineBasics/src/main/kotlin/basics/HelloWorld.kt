import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("World!")
    }
    print("Hello, ")
    Thread.sleep(2000)


    println("Program execution starts here")
    runBlocking {
        launch {
            delay(1000L)
            println("run blocking Task completed")
        }

        GlobalScope.launch {
            delay(100L)
            println("Global task completed")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Coroutine scope task completed")
            }
        }

        println("Program execution ends here")

    }
}
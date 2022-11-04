package basics

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch {
            delay(1000L)
            println("coroutine created using launch")
        }

        GlobalScope.launch {
            delay(500L)
            println("coroutine created inside global scope")
        }

        coroutineScope {
            launch {
                delay(200L)
                println("coroutine created inside coroutine scope")
            }
        }
    }
}
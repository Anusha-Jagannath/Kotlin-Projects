package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job1 = launch {
            println("Job1 launched")
        }
        val job2 = launch {
            println("job2 launched")
        }
        job1.invokeOnCompletion { println("Job1 is completed") }
        println("Job1 is cancelled")
        job1.cancel()
    }
}
package basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job = GlobalScope.launch {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException()
        }
        job.join()
    }
}
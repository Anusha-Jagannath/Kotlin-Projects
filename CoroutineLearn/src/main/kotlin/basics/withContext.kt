package basics

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    runBlocking {
        launch(Dispatchers.IO) {
            println("First print my context $coroutineContext")
        }

        withContext(Dispatchers.Default) {
            println("Second print my context $coroutineContext")
        }
        println("First print my context $coroutineContext")
    }
}
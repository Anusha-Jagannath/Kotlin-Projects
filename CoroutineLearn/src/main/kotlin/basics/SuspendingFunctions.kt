package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var functionCalls = 0
fun main() {

    runBlocking {
        launch {
            completeMessage()
            improveMessage()
        }
    }
    println("Number of function calls are $functionCalls")
}

suspend fun completeMessage() {
    delay(500L)
    println("World!")
    functionCalls++
}

suspend fun improveMessage() {
    delay(500L)
    println("suspending functions are cool")
    functionCalls++
}
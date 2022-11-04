import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() {
    runBlocking {
        val numbers = send()
        println("Flow not yet started")
        println("Flow started")

        withTimeoutOrNull(1000L) {
            numbers.collect {
                println(it)
            }
        }
    }
}

fun send() = flow {
    listOf(1, 2, 3).forEach {
        delay(400)
        emit(it)
    }
}
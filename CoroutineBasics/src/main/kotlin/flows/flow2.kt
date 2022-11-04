import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        sendNumbers().collect {
            println("Received numbers $it")
        }
    }
}

fun sendNumbers() = flow {
    for (i in 1..10) {
        emit(i)
    }
}
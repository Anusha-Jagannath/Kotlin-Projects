import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        println("working on flow")
        val numbers = sendNewNumbers()
        println("Flow hasn't started yet")
        println("Flow starting now")
        numbers.collect {
            println(it)
        }
    }
}

fun sendNewNumbers() = listOf(1,2,3).asFlow()
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch(CoroutineName("coroutine1")) {
            println("This is a run from ${coroutineContext[CoroutineName.Key]}")
        }
    }
}
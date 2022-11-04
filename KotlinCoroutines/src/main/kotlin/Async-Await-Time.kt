import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

//fun main() {
//
//    GlobalScope.launch(Dispatchers.IO) {
//        var time = measureTimeMillis {
//            var answer1 = networkCall3()
//            var answer2 = networkCall4()
//            println("Answer is $answer1")
//            println("Answer is $answer2")
//        }
//        println("Time taken for executing both functions $time ms")
//    }
//    Thread.sleep(3000)
//
//}
//suspend fun networkCall3(): String {
//    delay(1000)
//    return "Answer1"
//}
//
//suspend fun networkCall4(): String {
//    delay(1000)
//    return "Answer2"
//}
//
//
fun main() {

    GlobalScope.launch(Dispatchers.IO) {
        var time = measureTimeMillis {
            var answer1: String? = null
            var answer2:String? = null

            var job1 = launch { answer1 = networkCall1() }
            var job2 = launch { answer2 = networkCall2() }
            job1.join()
            job2.join()
            println("Answer is $answer1")
            println("Answer is $answer2")
        }
        println("Time taken for executing both functions $time ms")
    }
    Thread.sleep(3000)

}
suspend fun networkCall3(): String {
    delay(1000)
    return "Answer1"
}

suspend fun networkCall4(): String {
    delay(1000)
    return "Answer2"
}
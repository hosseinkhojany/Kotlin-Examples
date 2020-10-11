package context

import run.*
import util.*
import java.util.concurrent.*
import kotlin.coroutines.*

suspend fun makeRequest(): String {
    log("Making request...")
    return suspendCoroutine { c ->
        ForkJoinPool.commonPool().execute {
            c.resume("Result of the request")
        }
    }
}

fun display(result: String) {
    log("Displaying result '$result'")
}

fun main(args: Array<String>) {
    launch(Swing) {
        try {
            val result = makeRequest()
            display(result)
        } catch (exception: Throwable) {
        }
    }
}

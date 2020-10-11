package future

import java.util.concurrent.*
import kotlin.coroutines.*

suspend fun <T> CompletableFuture<T>.await(): T =
    suspendCoroutine<T> { cont: Continuation<T> ->
        whenComplete { result, exception ->
            if (exception == null)
                cont.resume(result)
            else
                cont.resumeWithException(exception)
        }
    }

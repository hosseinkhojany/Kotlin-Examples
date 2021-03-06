package sequence.optimized

import sequence.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

fun <T> sequence(block: suspend SequenceScope<T>.() -> Unit): Sequence<T> = Sequence {
    SequenceCoroutine<T>().apply {
        nextStep = block.createCoroutineUnintercepted(receiver = this, completion = this)
    }
}

class SequenceCoroutine<T>: AbstractIterator<T>(), SequenceScope<T>, Continuation<Unit> {
    lateinit var nextStep: Continuation<Unit>

    override fun computeNext() { nextStep.resume(Unit) }

    override val context: CoroutineContext get() = EmptyCoroutineContext

    override fun resumeWith(result: Result<Unit>) {
        result.getOrThrow()
        done()
    }

    override suspend fun yield(value: T) {
        setNext(value)
        return suspendCoroutineUninterceptedOrReturn { cont ->
            nextStep = cont
            COROUTINE_SUSPENDED
        }
    }
}

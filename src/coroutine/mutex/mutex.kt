package mutex

import java.util.concurrent.*
import java.util.concurrent.atomic.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

class Mutex {

    private val state = AtomicInteger(-1)
    private val waiters = ConcurrentLinkedQueue<Waiter>()

    suspend fun lock() {
        if (state.compareAndSet(-1, 0)) return
        return suspendCoroutineUninterceptedOrReturn sc@ { uc ->
            val waiter = Waiter(uc.intercepted())
            waiters.add(waiter)
            loop@ while (true) {
                val curState = state.get()
                if (curState == -1) {
                    if (state.compareAndSet(-1, 0)) {
                        waiter.resumed = true
                        return@sc Unit

                    }
                    check(curState >= 0)
                    if (state.compareAndSet(curState, curState + 1)) {
                        break@loop
                    }
                }
            }
            COROUTINE_SUSPENDED
        }
    }

    fun unlock() {
        while (true) {
            val curState = state.get()
            if (curState == 0) {
                if (state.compareAndSet(0, -1))
                    return
            } else {
                check(curState >= 1)
                if (state.compareAndSet(curState, curState - 1)) {
                    retrieveWaiter()!!.c.resume(Unit)
                    return
                }
            }
        }
    }

    private fun retrieveWaiter(): Waiter? {
        while (true) {
            val waiter = waiters.poll() ?: return null
            if (!waiter.resumed)
                return waiter
        }
    }

    private class Waiter(val c: Continuation<Unit>) {
        var resumed = false
    }
}

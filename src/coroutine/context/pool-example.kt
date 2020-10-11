package context

import future.*
import run.*
import util.*

fun main(args: Array<String>) = runBlocking(CommonPool) {
    val n = 4
    val compute = newFixedThreadPoolContext(n, "Compute")
    val subs = Array(n) { i ->
        future(compute) {
            log("Starting computation #$i")
            Thread.sleep(1000)
            log("Done computation #$i")
        }
    }
    subs.forEach { it.await() }
    log("Done all")
}
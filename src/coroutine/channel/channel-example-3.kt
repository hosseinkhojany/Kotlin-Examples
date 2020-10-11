package channel.example3

import channel.*

fun main(args: Array<String>) = mainBlocking {
    val c = Channel<Int>(2)
    c.send(1)
    c.send(2)
    println(c.receive())
    println(c.receive())
}
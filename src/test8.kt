//enum class State {
//    IDLE, RUNNING, FINISHED                           // 1
//}
//
//fun main() {
//    val message = when (State.RUNNING) {                      // 3
//        State.IDLE -> "It's idle"
//        State.RUNNING -> "It's running"
//        State.FINISHED -> "It's finished"
//    }
//    println(message)
//}
enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4
    println(red.containsRed())                        // 5
    println(Color.BLUE.containsRed())                 // 6
}


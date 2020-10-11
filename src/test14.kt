//fun findMinMax(list: List<Int>): Pair<Int, Int> {
//    // do the math
//    return Pair(50, 100)
//}
//
//fun main() {
////sampleStart                       // 1
//
//    val map = mapOf("Alice" to 21, "Bob" to 25)
//    for ((name, age) in map) {                                      // 2
//        println("$name is $age years old")
//    }
//
//    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3
//
////sampleEnd
//}


//data class User(val username: String, val email: String)    // 1
//
//fun getUser() = User("Mary", "mary@somewhere.com")
//
//fun main() {
//    val user = getUser()
//    val (username1, email) = user                            // 2
//    println(username1 == user.component1())                  // 3
//
//    val (_, emailAddress) = getUser()                       // 4
//
//}

class Pair<K, V>(val first: K, val second: V) {  // 1
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (num, name) = Pair(1, "one")             // 2

    println("num = $num, name = $name")
}



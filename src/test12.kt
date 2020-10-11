//fun customPrint(s: String) {
//    print(s.toUpperCase())
//}
//
//fun main() {
////sampleStart
//    val empty = "test".let {               // 1
//        customPrint(it)                    // 2
//        it.isEmpty()                       // 3
//    }
//    println(" is empty: $empty")
//
//
//    fun printNonNull(str: String?) {
//        println("Printing \"$str\":")
//
//        str?.let {                         // 4
//            print("\t")
//            customPrint(it)
//            println()
//        }
//    }
//    printNonNull(null)
//    printNonNull("my string")
////sampleEnd
//}

//fun main() {
//    //sampleStart
//    fun getNullableLength(ns: String?) {
//        println("for \"$ns\":")
//        var a: Int? = ns?.run {                                                  // 1
//            println("\tis empty? " + isEmpty())                    // 2
//            println("\tlength = $length")
//            length                                                 // 3
//        }
//        println(a)
//    }
//    getNullableLength(null)
//    getNullableLength("")
//    getNullableLength("some string with Kotlin")
////sampleEnd
//}

//class Configuration(var host: String, var port: Int)
//
//fun main() {
//    val configuration = Configuration(host = "127.0.0.1", port = 9000)
//
////sampleStart
//    with(configuration) {
//        println("$host:$port")
//    }
//
//    // instead of:
//    println("${configuration.host}:${configuration.port}")
////sampleEnd
//}


//data class Person(var name: String, var age: Int, var about: String) {
//    constructor() : this("", 0, "")
//}
//
//fun main() {
////sampleStart
//    val jake = Person()                                     // 1
//    val stringDescription = jake.apply {                    // 2
//        name = "Jake"                                       // 3
//        age = 30
//        about = "Android developer"
//    }.toString()                                            // 4
////sampleEnd
//    println(stringDescription)
//}

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Any) {
    println("A new person $p was created.")
}

fun main() {
//sampleStart
    val jake = Person("Jake", 30, "Android developer")   // 1
            .also {                                          // 2
                writeCreationLog(it.name)                         // 3
            }
    println(jake)
//sampleEnd
}

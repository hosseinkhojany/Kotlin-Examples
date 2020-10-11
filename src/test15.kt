fun main() {
    println(js("alert(\"alert from Kotlin!\")")) // 1
}

external fun js(s: String):String

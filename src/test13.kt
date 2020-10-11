//interface SoundBehavior {                                                          // 1
//    fun makeSound()
//}
//
//class ScreamBehavior(val n:String): SoundBehavior {                                // 2
//    override fun makeSound() = println("${n.toUpperCase()} !!!")
//}
//
//class RockAndRollBehavior(val n:String): SoundBehavior {                           // 2
//    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
//}
//
//// Tom Araya is the "singer" of Slayer
//class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)                       // 3
//
//// You should know ;)
//class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)              // 3
//
//fun main() {
//    val tomAraya = TomAraya("Thrash Metal")
//    tomAraya.makeSound()                                                           // 4
//    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
//    elvisPresley.makeSound()
//}


import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()                                               // 1

    override fun toString() = "Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}


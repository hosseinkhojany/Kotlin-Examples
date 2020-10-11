//import jdk.incubator.http.HttpRequest
//import java.lang.reflect.Type
//import java.util.*
//import javax.security.auth.Subject
//import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
//import kotlin.reflect.typeOf
//
//fun main(){
//
//    val valy = 10 // readable
//    var vary = 10 // readable - writeable
//    val vary2: String?
//    val vary3 = ""
//
//
//
//
////    val str: (Any) -> String = fun(arg:Any):String {
////         return when(arg){
////             is String -> "Ok"
////             else -> "No"
////         }
////    }
////    val str: (Any) -> String = fun(arg:Any):String {
////         return when{
////             arg is String -> "Ok"
////             else -> "No"
////         }
////    }
//
////    println(str("34"))
//
////    val sh = (1 shl 2) and 0b1111
////    print(sh)
////    print(digitChecker("00"))
//
//
////    var i: Int = 10
////    val a = if (i == 1){
////        10
////    }else{
////        20
////    }
////    var i: Int = 10
////    val a = if (i == 1) 10 else 20
//
//
////    for (item: Int in 0 until 20 step 3){
////        println(item)
////    }
//
//
////    listOf(1 ,3 ,3 ,3 ,4, 6 ,8).forEach forEach@{
////        if (it == 3)return@forEach
////        print(it)
////    }
////    print("done with explain label.")
//
////    val check: Boolean get() = this.size == 2
//
//
//}
////fun digitChecker(c: String): Boolean{
////    return c  in "0".."100"
////}
////
////fun hasPerfix(x: Any){
////    when(x) {
////        is Int -> print("is Int.")
////        is String -> print("is String.")
////        else -> print("Uknowns.")
////    }
////}
//
//
////class A: B("EE") {
////    fun a(): String{
////        return B("Helli").b()
////    }
////}
////open class B(ba:String){
////    var ab: String = ba
////     fun b(): String{
////        return ab
////    }
////
////    fun foo(){
////        listOf(1 ,3 ,3 ,3 ,4, 6 ,8).forEach lit@{
////            if (it == 3)return@lit
////                print(it)
////        }
////        print("done with explain label.")
////    }
//
////    fun foo(){
////        listOf(1 ,3 ,3 ,3 ,4, 6 ,8).forEach{
////            if (it == 3) {
////            print(it)
////            }
////
////        }
////        print("done with explain label.")
////    }
//
////    class Ctest private constructor(){
////
////    }
////    class Ctest2{
////        constructor(){
////
////        }
////    }
//
//
//    //basic inherit
//
////    class Shape: Circle() {
////        override fun draw() {
////            super.draw()
////        }
////
////        //prohibited re-overriding
////        final override fun draw_prohibited() {
////            super.draw_prohibited()
////        }
////    }
////
////    open class Circle{
////        open fun draw(){}
////        open fun draw_prohibited(){}
////    }
//
//
////    class Shape(override val ab: Int = 10): Circle(10) {
////        override fun draw() {
////            super.draw()
////        }
////
////        //prohibited re-overriding
////        final override fun draw_prohibited() {
////            super.draw_prohibited()
////        }
////    }
////
////    open class Circle(i: Int){
////        open val ab = 30
////        open fun draw(){}
////        open fun draw_prohibited(){}
////    }
//
//
////    class a{
////        init {
////            println("Hello")
////        }
////        constructor(){
////            println("Hello")
////        }
////    }
//
////    public class MyTest{
////        lateinit var subject: TestSubject
////        @SetUp fun setup(){
////            subject = TestSubject()
////        }
////        @Test fun test(){
////            subject.method()
////        }
////    }
//
////    interface Source<T> {
////
////    }
////    fun Demo(source: Source<String>){
////        val obj: Source<String> = source;
////    }
////    interface Source<out T> {
////
////    }
////    fun Demo(source: Source<String>){
////        val obj: Source<Any> = source;
////    }
//
////    fun <T> singeletonList(item: T): String{
////
////    }
//
//
//


open class e{
    public fun pow(a: Int = 2, b: Int = 3) :Int{
        var res: Int = 1
        for (i in 1..b step 1){
            res += res * res;
        }
        return res;
    }
}


fun main(s: Array<String>){
    println()
}

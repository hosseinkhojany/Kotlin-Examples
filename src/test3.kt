fun main() {
    fun someCondition() = true

    fun main() {
//sampleStart

        val d: Int = if (someCondition()) {
            1   // 2
        } else {
            2   // 2
        }  // 1

        println(d) // 3
//sampleEnd
    }

}
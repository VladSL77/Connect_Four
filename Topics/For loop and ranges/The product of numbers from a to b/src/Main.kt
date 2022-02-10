
const val ONE = 1L

fun main() {
    val start = readLine()!!.toLong()
    val end = readLine()!!.toLong()
    var result = ONE
    for (i in start until end) {
        result *= i
    }
    println(result)
}
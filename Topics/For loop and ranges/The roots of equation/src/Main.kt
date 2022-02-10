
const val MIN = 0
const val MAX = 1000

fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    for (x in MIN..MAX) {
        if (a * x * x * x + b * x * x + c * x + d == 0) println(x)
    }
}
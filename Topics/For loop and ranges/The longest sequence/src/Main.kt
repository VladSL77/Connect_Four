
const val ONE = 1

fun main() {
    // write your code here
    val num = readLine()!!.toInt()
    val list = List(num) { readLine()!!.toInt() }
    var maxSeq = ONE
    var seq = ONE
    for (i in 0 until list.lastIndex) {
        if (list[i] <= list[i + 1]) seq++ else seq = ONE
        if (seq > maxSeq) maxSeq = seq
    }
    println(maxSeq)
}
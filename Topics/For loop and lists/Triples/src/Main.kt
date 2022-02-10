fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val list = arrayListOf<Int>()
    var countTriples = 0
    for (i in 0 until size) {
        list.add(readLine()!!.toInt())
    }
    for (i in 0..list.lastIndex - 2) {
        if (list[i] == list[i + 1] - 1 && list[i] == list[i + 2] - 2) countTriples++
    }
    println(countTriples)
}
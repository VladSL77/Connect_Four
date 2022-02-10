fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    var next: Int
    for (i in number downTo 1) {
        next = readLine()!!.toInt()
        if (next < min) min = next
    }
    println(min)
}
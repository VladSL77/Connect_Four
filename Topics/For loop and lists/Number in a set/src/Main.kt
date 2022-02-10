fun main() {
    // write your code here
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val number = readLine()!!.toInt()
    println(if (list.contains(number)) "YES" else "NO")
}
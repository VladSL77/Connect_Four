fun main() {
    // write your code here
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    list.add(0, list[list.lastIndex])
    list.removeLast()
    print(list.joinToString(" "))
}
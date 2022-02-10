fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val list = MutableList(size) { readLine()!!.toInt() }
    var position = readLine()!!.toInt()
    if (position > size) position %= size
    for (i in 0 until position) {
        list.add(0, list[list.lastIndex])
        list.removeLast()
    }
    print(list.joinToString(" "))
}
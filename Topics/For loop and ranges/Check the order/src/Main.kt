fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    val list = List(number) { readLine()!!.toInt() }
    var result = "YES"
    for (i in 0 until list.lastIndex) {
        if (list[i] >= list [i + 1]) result = "NO"
    }
    println(result)
}
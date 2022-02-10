fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    val list = List(number) { readLine()!!.toInt() }.sortedDescending()
    println(if (number == 1) list[0] else list[0] * list[1])
}


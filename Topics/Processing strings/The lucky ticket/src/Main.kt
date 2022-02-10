fun main() {
    // write your code here
    val ticket = readLine()!!.toString()
    val list = ticket.toMutableList().map { it.toInt() }
    println(if (list[0] + list[1] + list [2] == list[3] + list[4] + list [5]) "Lucky" else "Regular")
}
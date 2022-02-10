fun main() {
    // write your code here
    val date = readLine()!!
    val list = date.split("-").toMutableList()
    println("${list[1]}/${list[2]}/${list[0]}")
}
fun main() {
    // write your code here
    val number = readLine()!!
    val first = number.substring(0, number.length / 2).map { it.toInt() }
    val second = number.substring(number.length / 2, number.length).map { it.toInt() }
    if (first.sum() == second.sum()) println("YES") else println("NO")
}
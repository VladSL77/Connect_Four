fun main() {
    // write your code here
    val str1 = readLine()!!
    var str2 = ""
    for (ch in str1) {
        str2 += "$ch$ch"
    }
    println(str2)
}
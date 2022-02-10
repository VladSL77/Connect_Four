fun main() {
    // put your code here
    var string = readLine()!!.toString()
    val last = string[string.lastIndex]
    string = string.replaceAfterLast(string[string.lastIndex - 1], string[0].toString())
    string = string.replaceFirst(string[0], last)
    println(string)
}
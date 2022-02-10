fun main() {
    // write your code here
    val list = readLine()!!.split(" ").toMutableList()
    var maxSize = 0
    var maxElement = ""
    for (i in list) {
        if (i.length > maxSize) {
            maxSize = i.length
            maxElement = i
        }
    }
    println(maxElement)
}
fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val mutList = mutableListOf<Int>()
    for (i in 0 until size) {
        mutList.add(readLine()!!.toInt())
    }
    val number = readLine()!!.toInt()
    var count = 0
    for (i in mutList) {
        if (i == number) count++
    }
    println(count)
}
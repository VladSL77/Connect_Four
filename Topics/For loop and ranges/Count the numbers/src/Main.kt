fun main() {

    val start = readLine()!!.toLong()
    val end = readLine()!!.toLong()
    val div = readLine()!!.toLong()
    var amount = 0

    for (i in start..end) {
        if (i % div == 0L) amount++
    }

    println(amount)

}
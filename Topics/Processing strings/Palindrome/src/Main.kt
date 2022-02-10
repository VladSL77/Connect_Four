
// const val TWO = 2

fun main() {
    // write your code here

    val string = readLine()!!.toString()
    println(if (string == string.reversed()) "yes" else "no")

    /* Below my code. Its not perfect :(
    val charsList = readLine()!!.toString().toMutableList()
    val s = charsList.size / TWO
    var result = "yes"
    for (i in 0..s) {
        if (charsList[i] != charsList[charsList.lastIndex - i]) {
            result = "no"
            break
        }
    }
    println(result)
    */
}
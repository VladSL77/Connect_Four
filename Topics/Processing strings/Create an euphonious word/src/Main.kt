const val VOWELS = "aeiouy"
const val TWO = 2

fun main() {
    // write your code here
    val string = readLine()!!.toMutableList()
    var charCurrent: Char?
    var charPrev: Char? = null
    var inCount = 0
    var outCount = 0
    for (i in string) {
        charCurrent = if (i in VOWELS) 'v' else 'c'
        if (charCurrent == charPrev && inCount == TWO) {
            inCount = 0
            outCount++
        } else if (charCurrent != charPrev) inCount = 0
        inCount++
        charPrev = charCurrent
    }
    println(outCount)
}
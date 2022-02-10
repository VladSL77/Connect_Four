
const val THREE = 3
const val FIVE = 5

fun main() {

    val start = readLine()!!.toInt()
    val end = readLine()!!.toInt()

    for (i in start..end) {
        if (i % THREE == 0) {
            if (i % FIVE == 0) {
                println("FizzBuzz")
            } else println("Fizz")
        } else {
            if (i % FIVE == 0) {
                println("Buzz")
            } else println(i)
        }
    }

}
package connectfour

const val STANDARD_ROW = 6
const val STANDARD_COLUMNS = 7

fun main() {

    var firstName = ""
    var secondName = ""
    var inputDimensions = ""
    var rows = STANDARD_ROW
    var columns = STANDARD_COLUMNS
    var validInput = false
    val validArray = arrayOf(5, 6, 7, 8, 9)
    val regex = Regex("""\s*\d+\s*(x|X)\s*\d+\s*""")

    println("Connect Four")
    println("First player's name:")
    firstName = readLine()!!
    println("Second player's name:")
    secondName = readLine()!!

    while (!validInput) {
        println("""Set the board dimensions (Rows x Columns)
        |Press Enter for default (6 x 7)""".trimMargin())
        inputDimensions = readLine()!!.toString()
        if (inputDimensions.isEmpty()) {
            validInput = true
            break
        }
        if (inputDimensions.matches(regex)) {
            rows = inputDimensions.lowercase().substringBefore("x").trim().toInt()
            columns = inputDimensions.lowercase().substringAfter("x").trim().toInt()
            if (rows in validArray && columns in validArray) {
                validInput = true
                break
            } else {
                if (rows !in validArray) {
                    println("Board rows should be from 5 to 9")
                } else {
                    println("Board columns should be from 5 to 9")
                }
            }

        } else {
            println("Invalid input")
        }
    }
    println("""$firstName VS $secondName
        |$rows X $columns board""".trimMargin())
}
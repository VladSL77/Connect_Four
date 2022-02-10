
const val HUNDRED = 100

fun main() {
    // write your code here
    val numbersOfCompanies = readLine()!!.toInt()
    val incomeOfCompany = MutableList(numbersOfCompanies) { readLine()!!.toDouble() }
    val tax = MutableList(numbersOfCompanies) { readLine()!!.toDouble() }
    for (i in 0 until numbersOfCompanies) {
        tax[i] = incomeOfCompany[i] * tax[i] / HUNDRED
    }
    println(tax.indexOf(tax.maxOrNull()) + 1)
}
fun main() {
    // write your code here
    val string = readLine()!!
    var pass = ""
    val subString = string.substringAfter('?')
        .replace("=&", "=not found&")
        .replace("=", " : ")
    val list = subString.split("&").toList()
    for (str in list) {
        if (str.contains("pass :")) pass = str.substringAfter(": ")
        println(str)
    }
    if (pass != "") println("password : $pass")
}
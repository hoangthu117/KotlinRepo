package CheckedException

fun main() {
    val str = "123a"
    val result = convertToInt(str)
    println(result)
}

fun convertToInt(str: String): Int {
    return str.toIntOrNull() ?: 0
}

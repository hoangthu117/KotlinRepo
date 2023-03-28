import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun downloadData(url: String, callback: (String) -> Unit) {
    val content = StringBuilder()
    val urlObject = URL(url)
    val connection = urlObject.openConnection()
    val input = BufferedReader(InputStreamReader(connection.getInputStream()))

    var line = input.readLine()
    while (line != null) {
        content.append(line)
        line = input.readLine()
    }

    input.close()
    callback(content.toString())
    println("test")
}


fun main() {
    // Sử dụng callback function
    downloadData("https://jsonplaceholder.typicode.com/todos/1") { data ->
        println("Dữ liệu tải về: $data")
    }
}


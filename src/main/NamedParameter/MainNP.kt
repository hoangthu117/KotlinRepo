package NamedParameter

fun printPersonInfo(name: String, age: Int, address: String) {
    println("Name: $name")
    println("Age: $age")
    println("Address: $address")
}
fun main() {
    // Gọi hàm sử dụng named parameters
        printPersonInfo(name = "Tuan", age = 30, address = "123 Main St")

    // Gọi hàm sử dụng named parameters và thay đổi thứ tự các tham số
        printPersonInfo(address = "123 Main St", age = 30, name = "Hai")
}
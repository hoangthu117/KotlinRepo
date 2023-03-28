/*
Type inference là khả năng của Kotlin tự động suy luận kiểu dữ liệu của biến hoặc biểu thức từ giá trị được gán cho nó.

Trong Kotlin, để sử dụng tính năng này, bạn chỉ cần khai báo biến mà không cần xác định rõ kiểu dữ liệu của nó.
Kotlin sẽ tự động suy ra kiểu dữ liệu dựa trên giá trị được gán cho biến.
 */
fun main(args: Array<String>) {
    val a = 10 // a sẽ được suy luận là kiểu Int
    val b = "Hello" // b sẽ được suy luận là kiểu String
    val c = 3.14 // c sẽ được suy luận là kiểu Double
    print("Kiểu dữ liệu của a:" + a::class.simpleName
        + "\nKiểu dữ liệu của b:" + b::class.simpleName
        + "\nKiểu dữ liệu của c:" + c::class.simpleName)
}

/*
Type inference giúp làm code của bạn ngắn gọn hơn và giảm khả năng mắc lỗi khi khai báo kiểu dữ liệu sai.
Tuy nhiên, nên cẩn thận sử dụng type inference để tránh gây nhầm lẫn về kiểu dữ liệu trong code.
 */
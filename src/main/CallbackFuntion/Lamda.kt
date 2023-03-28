
// using callback funtion
fun performOperation(a: Int, b: Int,callback: (Int) -> Unit){
    val result = a + b
    callback(result)
}

//#region: Non lamda
fun sumWithoutLambda(result: Int) {
    println("Tổng của hai số là: $result")
}

fun main() {
    //using lamda
    performOperation(2, 3) { result -> print("Tổng của hai số là: $result") }

    //non-using lamda
    println("\nCallback with non lamda")
    performOperation(4,5,::sumWithoutLambda)

}

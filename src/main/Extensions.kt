fun Int.isEven(): Boolean {
    return this % 2 == 0
}
fun String.countWords(): Int{
    return this.split(" ").size
}
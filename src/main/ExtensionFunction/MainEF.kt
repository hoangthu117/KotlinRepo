package ExtensionFunction

import countWords
import isEven

fun main(args: Array<String>) {
    val number = 5
    if (number.isEven())
        println("số chẵn")
    else
        println("số lẻ")
    //
    val text = "a simple text"
    println(text.countWords())
}
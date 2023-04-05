fun doSomethingAsync(callback1: () -> Unit) {
    // Perform asynchronous operation
    // When it is done, call the callbacks
    callback1()
    //callback2()
}

fun main(args: Array<String>) {
    // Usage
    doSomethingAsync(){
        println("Callback 1 called")
    }
}


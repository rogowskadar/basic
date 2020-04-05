class MyClass() {

    companion object {

        var liczba = 10
        fun doSomething() {
            println("Sam sobie zrób")
        }
    }
}

fun main() {

    val x = MyClass.liczba
    println("$x")
    MyClass.doSomething()
}
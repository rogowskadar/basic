fun main() {

    println("Ile sekund chcesz odmierzyć?")
    val time: Int = readLine()!!.toInt()

    for (i in time downTo 0) {
        if (i != 0) {
            println(i)
            Thread.sleep(1000)
        } else {
            println("koniec czasu")
        }
    }
}
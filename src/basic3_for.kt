fun main() {

    println("Wpisz ile razy wyświetlić słowo 'kotlin' ")
    val ileRazy: Int = readLine()!!.toInt()

    for (i in 1..ileRazy) {
        println("$i. kotlin")
    }
}
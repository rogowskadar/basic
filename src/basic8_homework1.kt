fun main() {

    val listaRoslin = arrayOf("różą", "tulipan", "bratek", "klon", "lipa", "storczyk")

    do {
        println("Które słowo z kolei z tablicy chcesz wyświetlić?")
        val x: Boolean = processInput(listaRoslin)
    } while (!x)
}

private fun processInput(listaRoslin: Array<String>): Boolean {
    val index: Int = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        println("Wprowadź indeks w formacie liczbowym.")
        return false
    }

    try {
        println(listaRoslin[index])
    } catch (e: IndexOutOfBoundsException) {
        if (index < 0) println("indeks jest za mały")
        else println("Taki indeks nie istnieje.")
        return false
    }
    return true
}
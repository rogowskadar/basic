fun ktoWygra(pies1: pies, pies2: pies) {
    if (pies1.glos > pies2.glos) {
        println("Pies1 wygrywa!")
    }
    if (pies1.glos < pies2.glos) {
        println("Pies2 wygrywa!")
    }
    if (pies1.glos == pies2.glos) {
        println("Psy szczekają tak samo głośno.")
    }
}

class pies(waga: Int, glos: Int) {
    var waga = waga
    var glos = glos

    fun dajGlos() {
        println("Woof! Woof!")
    }
}

fun main() {
    val Azor = pies(1, 10)
    val Burek = pies(20, 100)

    ktoWygra(Azor, Burek)
}
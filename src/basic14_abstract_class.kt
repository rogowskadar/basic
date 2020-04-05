abstract class Istota(wys: Double, szer: Double, dlug: Double, var waga: Int) {

    abstract fun przedstawSie()

    open fun hej() {
        println("hej")
    }
}

class Human(
    var wys: Double,
    var szer: Double,
    var dlug: Double,
    waga: Int
) : Istota(wys, szer, dlug, waga) {

    var imie = "Marek"
    var nazwisko = "Kowalski"

    override fun przedstawSie() {
        println("Cześć, jestem $imie $nazwisko.")
    }

    override fun hej() {
        println("czesc")
    }
}

fun main() {

    var czlowiek = Human(160.0, 70.0, 30.0, 80)
    czlowiek.przedstawSie()
    czlowiek.hej()
}
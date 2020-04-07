import java.util.function.Predicate

fun main() {

    /*var mojaPierwszaLambda = { liczba1: Int, liczba2: Int -> liczba1 + liczba2 }

    for (i: Int in 0..10) {
        println(mojaPierwszaLambda(i, 1))
    } */

    val listaZwierzat: Array<String> = arrayOf("Pies", "Kot", "Papuga", "Słoń", "Wiewiórka", "Ptak")
    listaZwierzat.asList()
        .stream()
        .filter { t -> t?.get(0) == 'P' }
        //.filter(Sprawdzenie())
        .forEach { slowo -> println(slowo) }
}

class Sprawdzenie : Predicate<String> {
    override fun test(t: String): Boolean {
        if (t.get(0) == 'P') return true
        return false
    }
}
fun sumaCyfr(liczba: Int): Int {

    var wynik = 0
    var cyfra: Int
    var number = liczba

    while (number > 0) {
        cyfra = number % 10
        wynik += cyfra
        number /= 10
    }
    return wynik
}

fun mnozenie(czynnik1: Int, czynnik2: Int): Int {
    return czynnik1 * czynnik2
}

fun main() {

    println("Podaj liczbę, której chcesz zsumować cyfry.")
    val liczba: Int = readLine()!!.toInt()
    println(sumaCyfr(liczba))

    println("Podaj pierwszą liczbę do mnożenia.")
    val czynnik1 = readLine()!!.toInt()
    println("Podaj drugą liczbę do mnożenia.")
    val czynnik2 = readLine()!!.toInt()
    println(mnozenie(czynnik1, czynnik2))
}
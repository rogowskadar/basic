fun pierwiastek(liczba: Double): Double {

    if (liczba < 0) throw ArithmeticException("Nie istnieje pierwiastek z liczby ujemnej!")

    return kotlin.math.sqrt(liczba)
}

fun main() {

    print("Podaj liczbę, z której chcesz wyciągnąć pierwiastek: ")
    var liczbaInput: String? = readLine()

    try {
        println(pierwiastek(liczbaInput!!.toDouble()))
    } catch (wyjatek: NumberFormatException) {
        println(wyjatek)
        println("Dane wejściowe są nieprawidłowe.")
    } catch (wyjatek: ArithmeticException) {
        println(wyjatek.message)
    }
}
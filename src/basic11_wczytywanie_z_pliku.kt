import java.io.File

fun wczytajPlik(): List<String> {

    val sciezka = "document.txt" // sciezka dostępu do pliku, ścieżka pośrednia, ścieżka bezpośrednia: "~Users/..."
    val plik = File(sciezka)

    return plik.readLines()
}

fun policzSrednia(dane: List<String>): Double {
    val liczbaElementow = dane.size // ilość elementów w dokumencie wczytywany
    var sumaElementow = 0.0 // suma wszystkich elementów w dokumencie wczytywanym

    for (i: String in dane) {
        // println(i.toDouble())
        sumaElementow += i.toDouble()
    }
    return sumaElementow / liczbaElementow
}

fun main() {
    println(policzSrednia(wczytajPlik())) // wypisanie średniej z listy umieszczonej w zewnętrznym dokumencie
    println("%.3f".format(policzSrednia(wczytajPlik()))) //zaokrąglenie do "x..f" liczb po przecinku
}
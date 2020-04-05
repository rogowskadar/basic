import java.io.File
import java.nio.charset.Charset

private fun wczytajPlik(): List<String> {
    var sciezka = "losowe_liczby.txt"
    var plik = File(sciezka)

    return plik.readLines()
}

fun wpiszDoTablicy(liczby: List<String>): ArrayList<Int> {
    var tablica: ArrayList<Int> = arrayListOf()

    for (i in liczby) {
        tablica.add(i.toInt())
    }
    return tablica
}

fun policzSumeLiczb(dane: ArrayList<Int>): Int {
    var sumaLiczb = 0

    for (i in dane) {
        sumaLiczb += i
    }
    return sumaLiczb
}

fun zapiszDoPliku(wynik: Int) {
    val sciezka = "wynik.txt"
    var plik = File(sciezka)
    plik.writeText(wynik.toString(), Charset.defaultCharset())
}

fun main() {
    /*
    kilka sposobów tworzenia tablic
    var tablicaInt: IntArray = intArrayOf(1,2,3,4,5,6)
    var tablicaInt2: Array<Int> = Array(6) { i -> i} //Array( size:6, {i -> i}) każdy element taki sam jak indeks element
    var tablicaInt3: Array<Int> = arrayOf(7, 8, 9, 10) */

    var dane: List<String> = wczytajPlik()
    var tablicaArrayList: ArrayList<Int> = wpiszDoTablicy(dane)
    var sumaLiczb = policzSumeLiczb(tablicaArrayList)
    println(sumaLiczb)

    zapiszDoPliku(sumaLiczb)
}
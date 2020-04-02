class Kot(var waga: Double, var szybkosc: Double, var glos: Int, var sila: Int)

class Pies(var waga: Double, var szybkosc: Double, var glos: Int, var sila: Int)

fun ktoWygra(pies: Pies, kot: Kot) {
    var punktyKot = 0
    var punktyPies = 0

    if (kot.waga > pies.waga) punktyKot += 1
    if (kot.waga < pies.waga) punktyPies += 1
    if (kot.szybkosc > pies.szybkosc) punktyKot += 1
    if (kot.szybkosc < pies.szybkosc) punktyPies += 1
    if (kot.glos > pies.glos) punktyKot += 1
    if (kot.glos < pies.glos) punktyPies += 1
    if (kot.sila > pies.sila) punktyKot += 1
    if (kot.sila < pies.sila) punktyPies += 1

    println("Kot ma punktów: $punktyKot, a pies ma punktów: $punktyPies.")
    if (punktyKot > punktyPies) println("Wygrywa kot!")
    if (punktyKot == punktyPies) println("Jest remis.")
    if (punktyKot < punktyPies) println("Wygrywa pies!")
}

fun main() {
    println("Wprowadź dane psa w wartościach liczbowych.")
    print("Waga psa: ")
    val wagaPsa = readLine()!!.toDouble()
    print("Szybkość psa: ")
    val szybkoscPsa = readLine()!!.toDouble()
    print("Głos psa: ")
    val glosPsa = readLine()!!.toInt()
    print("Siła psa: ")
    val silaPsa = readLine()!!.toInt()

    println("Wprowadź dane kota w wartościach liczbowych.")
    print("Waga kota: ")
    val wagaKota = readLine()!!.toDouble()
    print("Szybkość kota: ")
    val szybkoscKota = readLine()!!.toDouble()
    print("Głos kota: ")
    val glosKota = readLine()!!.toInt()
    print("Siła kota: ")
    val silaKota = readLine()!!.toInt()
    ktoWygra(
        Pies(wagaPsa, szybkoscPsa, glosPsa, silaPsa),
        Kot(wagaKota, szybkoscKota, glosKota, silaKota)
    )
}
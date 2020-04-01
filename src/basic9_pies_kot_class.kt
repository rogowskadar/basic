class Kot(var waga: Double, var szybkosc: Double, var glos: Int, var sila: Int)

class Pies(var waga: Double, var szybkosc: Double, var glos: Int, var sila: Int)

fun ktoWygra(pies: Pies, kot: Kot) {
    var punktyKot = 0
    var punktyPies = 0

    if (kot.waga > pies.waga) {
        punktyKot += 1
    }
    if (kot.waga < pies.waga) {
        punktyPies += 1
    }

    if (kot.szybkosc > pies.szybkosc) {
        punktyKot += 1
    }
    if (kot.szybkosc < pies.szybkosc) {
        punktyPies += 1
    }

    if (kot.glos > pies.glos) {
        punktyKot += 1
    }

    if (kot.glos < pies.glos) {
        punktyPies += 1
    }

    if (kot.sila > pies.sila) {
        punktyKot += 1
    }

    if (kot.sila < pies.sila) {
        punktyPies += 1
    }

    println("Kot ma $punktyKot punktów, a pies ma $punktyPies punktów.")
    if (punktyKot > punktyPies) {
        println("Wygrywa kot!")
    }
    if (punktyKot == punktyPies) {
        println("Jest remis.")
    }
    if (punktyKot < punktyPies) {
        println("Wygrywa pies!")
    }
}

fun main() {
    ktoWygra(
        Pies(10.0, 10.0, 10, 10),
        Kot(5.0, 5.0, 10, 2)
    )
}
open class Postac(var imie: String) {
    var hp = 100
    var sila = 10
    var inteligencja = 10
    var kondycja = 10
    var zrecznosc = 10
    var bystrosc = 10

    fun atakuj(postac: Postac) {
        println("Zadałeś obrażenia przeciwnikowi ${postac.imie} równe $sila.")
    }

    fun uzyjPotkiHP() {
        println("Przywróciłeś sobie 30HP.")
    }
}

class Mag(imie: String) : Postac(imie) {
    var mana = 100

    fun rzucZaklecie(postac: Postac) {
        mana -= 20
        println("Zadałeś obrażenia magiczne przeciwko użytkownikowi ${postac.imie} równe ${inteligencja * 2}.")
    }
}

class Wojownik(imie: String) : Postac(imie) {

    var wytrzymalosc = 100

    fun uderzMieczem(postac: Postac) {
        wytrzymalosc -= 20
        println("Zadałeś obrażenia fizyczne przeciwnikowi ${postac.imie} równe ${sila * 2}.")
    }
}

fun main() {
    val Malzachar = Mag("Malzachar")
    val Artur = Wojownik("Artur")

    Malzachar.rzucZaklecie(Artur)
    Artur.uderzMieczem(Malzachar)
}
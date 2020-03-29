fun main() {

    val naszaStala =10

    println("Wprowadź liczbę. Sprawdzę czy jest większa lub równa $naszaStala. Jeśli jest mniejsza, sprawdzę podzielność przez 2.")
    val naszaLiczba:Int = readLine()!!.toInt()
    val wynik: Int = naszaLiczba%naszaStala

    println(wynik)

    if (naszaLiczba >= naszaStala) println("Podana liczba jest większa lub równa $naszaStala")
    else if(naszaLiczba%2==0) println("Podana liczba jest mniejsza niż $naszaStala i jest podzielna przez 2.")
    else println("Podana liczba jest mniejsza niż $naszaStala i nie jest podzielna przez 2.")

}
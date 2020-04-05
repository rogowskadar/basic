interface ObslugaDanych {

    fun podajImiona(): List<String>
    fun wypiszImiona(imiona: List<String>)
}

class MojeDane : ObslugaDanych {
    override fun podajImiona(): List<String> {
        println("Podaj Liczbę imion i wpyisz je w kolejnych liniach.")

        var imiona: List<String> = List<String>(readLine()!!.toInt(), { index -> readLine()!! })
        return imiona
    }

    override fun wypiszImiona(imiona: List<String>) {
        println(imiona)
    }
}

fun main() {

    val mojeDane = MojeDane()
    val imiona: List<String> = mojeDane.podajImiona()
    mojeDane.wypiszImiona(imiona)
}
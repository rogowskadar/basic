import java.math.MathContext

fun main(args: Array<String>) {

    var czySieRusza: String
    var czyPowinnoSieRuszac: String

    println("Czy coś się rusza?")
    czySieRusza= readLine()!!.toUpperCase()

    if (czySieRusza=="TAK"){
        println("A powinno się ruszać?")
        czyPowinnoSieRuszac = readLine()!!.toUpperCase()

        if (czyPowinnoSieRuszac=="NIE"){
            println("Zabezpiecz taśmą klejącą")
        }
        else{
            println("To po problemie")
        }
    }
    else{
        println("A powinno się coś ruszać?")
        czyPowinnoSieRuszac = readLine()!!.toUpperCase()
        if (czyPowinnoSieRuszac=="NIE"){
            println("Po problemie")
        }
        else{
            println("Użyj WD40!")
        }

    }
}
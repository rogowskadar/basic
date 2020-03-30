fun main() {

    val tablica = arrayOf("żółw", "mars", "rower", "drożdżówka", "motyl")

    for (slowo in tablica) {

        var dlugoscCiagu = slowo.length

        while (dlugoscCiagu > 0) {
            print(slowo[dlugoscCiagu - 1])
            dlugoscCiagu--
        }
        println()
    }
}
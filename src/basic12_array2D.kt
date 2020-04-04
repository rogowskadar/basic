fun main() {

    var tablica2D: Array<IntArray> =
        Array(20, { IntArray(50) }) // {} wskazana wartość każdej "szufladki", w każdej szufladce następna tablica

    for (i: Int in 0 until 20) {
        for (j: Int in 0 until 50) {
            tablica2D[i][j] = 0
        }
    } // Do każdego elementu tablicy przypisywane jest"0"

    for (i: Int in 5 until 15) {
        for (j: Int in 15 until 35) {
            tablica2D[i][j] = 1
        }
    } // Dla wskazanych elementów przypisana jest "1"

    for (i: Int in 0 until 20) {
        for (j: Int in 0 until 50) {
            print(tablica2D[i][j])
        }
        println()
    } // wyświetla wszystkie elementy tablicy
}
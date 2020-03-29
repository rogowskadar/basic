import kotlin.math.roundToInt

fun main() {

    when (val obiekt: Any = 8.9878) {
        is String -> {
            println("To jest String.")
            println(obiekt.toUpperCase())
        }
        is Int -> {
            println("To jest Int.")
            println("Wartość zwiększona o 10 to ${obiekt + 10}")
        }
        is Float -> {
            println("To jest Float. Zaokroąglone wynosi:")
            println(obiekt.roundToInt())
        }
        is Char -> {
            println("To jest Char")
            println("$obiekt to jest znak.")
        }
        is Long -> {
            println("To jest Long")
            println("Wartość wynosi: $obiekt.")
        }
        else -> println("Stworzyłeś jakieś monstrum.")

    }
}
import java.util.regex.Pattern

fun String.policzSlowa(): Int {
    return this.split(Pattern.compile(" "), limit = 0).size
}

operator fun String.times(ileRazy: Int) : String {
    return this.repeat(ileRazy)
}
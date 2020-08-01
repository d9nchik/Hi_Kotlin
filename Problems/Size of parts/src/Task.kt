import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var ready = 0
    var fix = 0
    var rejects = 0
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            1 -> fix++
            -1 -> rejects++
            0 -> ready++
        }
    }
    println("$ready $fix $rejects")
}
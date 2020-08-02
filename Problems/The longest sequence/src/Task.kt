import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var best = 0
    var currentScore = 1
    var previous = Int.MAX_VALUE

    repeat(scanner.nextInt()) {
        val current = scanner.nextInt()
        if (current >= previous)
            currentScore++
        else {
            best = best.coerceAtLeast(currentScore)
            currentScore = 1
        }
        previous = current
    }
    println(best.coerceAtLeast(currentScore))
}
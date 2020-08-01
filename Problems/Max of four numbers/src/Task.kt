import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = scanner.nextInt()
    for (x in 1..3) {
        max = max.coerceAtLeast(scanner.nextInt())
    }
    println(max)
}
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val speed = scanner.nextLine().toInt()
    var restriction = scanner.nextLine()
    if (restriction == "no limit") {
        restriction = "60"
    }
    println(if (speed > restriction.toInt()) "Exceeds the limit by ${speed - restriction.toInt()} kilometers per hour" else "Within the limit")
}
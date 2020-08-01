import java.util.Scanner
import kotlin.math.floor

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextDouble()
    println(floor(number * 10).toInt() % 10)
}
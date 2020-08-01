import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextLong()
    val sign = scanner.next().first()
    val num2 = scanner.nextLong()

    println(when (sign) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 == 0L) "Division by 0!" else num1 / num2
        else -> "Unknown operator"
    })

    // write your code here
}
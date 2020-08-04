import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val first = input.nextInt()
    val second = input.nextInt()
    println(if (second != 0) first / second else "Division by zero, please fix the second argument!")
}
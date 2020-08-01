import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println(num in 1..9)
}
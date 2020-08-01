import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()
    println(!(first==second||second==third||first==third))
}
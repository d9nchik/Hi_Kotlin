import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println(num%10+num/10%10+num/100%10)
}
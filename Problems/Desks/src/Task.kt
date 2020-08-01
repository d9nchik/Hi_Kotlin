import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()
    var result=0
    result+=first/2+first%2+second/2+second%2+third/2+third%2
    println(result)
}
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(if (number<0) "negative" else if (number>0) "positive" else "zero")
    // write your code here
}
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt()}
    println(if (arr.contains(scanner.nextInt())) "YES" else "NO")
    // write your code here
}
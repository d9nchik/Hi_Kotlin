import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a =scanner.nextInt()
    val b =scanner.nextInt()
    val c =scanner.nextInt()
    val d =scanner.nextInt()
    val e =scanner.nextInt()
    println(e in a..b||e in c..d)
    // write your code here
}
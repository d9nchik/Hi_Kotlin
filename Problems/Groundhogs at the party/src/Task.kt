import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // write your code here
    val peanuts = scanner.nextInt()
    if (scanner.nextBoolean())
        println(peanuts in 15..25)
    else
        println(peanuts in 10..20)
}
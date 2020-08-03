import java.util.*
import kotlin.math.abs

// write your code here

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}

fun getLastDigit(num: Int) = abs(num % 10)
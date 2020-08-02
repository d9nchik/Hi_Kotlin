import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    for (num in scanner.nextInt()..scanner.nextInt()) {
        println(when {
            num % 3 == 0 -> if (num % 5 == 0) "FizzBuzz" else "Fizz"
            num % 5 == 0 -> "Buzz"
            else -> num
        })
    }
    // write your code here
}
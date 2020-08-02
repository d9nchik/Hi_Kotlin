import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()

    var counter = 0
    for (number in a..b) {
        if (number % n == 0)
            counter++
    }
    println(counter)
}
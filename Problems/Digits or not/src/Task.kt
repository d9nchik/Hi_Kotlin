import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    for (x in 1..4) {
        print(scanner.next()[0].isDigit())
        if (x != 4)
            print("\\")
    }
    println()
}
import java.util.*
import java.util.regex.Pattern
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)

    var amount = scanner.nextLine().toInt()
    scanner.nextLine().split(Pattern.compile("\\s+")).stream().mapToInt { e -> e.toInt() }.forEach { need->
        run {
            if (amount - need >= 0)
                amount -= need
            else {
                println("Error, insufficient funds for the purchase. You have $amount, but you need $need.")
                exitProcess(0)
            }
        }
    }

    println( "Thank you for choosing us to manage your account! You have $amount money.")
}
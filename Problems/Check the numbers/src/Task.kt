import java.util.*
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    for (ind in 1..arr.lastIndex) {
        if ((arr[ind] == n && arr[ind - 1] == m) || (arr[ind] == m && arr[ind - 1] == n)) {
            println("NO")
            exitProcess(0)
        }
    }
    println("YES")
    // write your code here
}
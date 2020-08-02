import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    for (ind in 1..arr.lastIndex) {
        if ((arr[ind] == n && arr[ind - 1] == m) || (arr[ind] == m && arr[ind - 1] == n)){
            println("YES")
            exitProcess(0)
        }
    }
    println("NO")
    // write your code here
}
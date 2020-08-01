import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val string = scanner.nextLine()
    val index = scanner.nextInt()
    println("Symbol # $index of the string \"$string\" is '${string[index - 1]}'")
    // write your code here
}
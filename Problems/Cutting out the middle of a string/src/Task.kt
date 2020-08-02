import java.util.*

fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val line = input.next()
    val middle = line.length / 2
    println(if (line.length % 2 == 0) line.substring(0, middle - 1) + line.substring(middle + 1)
    else line.substring(0, middle) + line.substring(middle + 1))
}
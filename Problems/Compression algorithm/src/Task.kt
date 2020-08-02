import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val str = input.next()

    if (str.isEmpty())
        println()

    var previous = str[0]
    var result = "$previous"
    var counter = 1

    for (ch in 1..str.lastIndex) {
        val c = str[ch]
        if (c == previous)
            counter++
        else {
            result += counter
            counter = 1
            previous = c
            result += c
        }
    }
    println(result + counter)
}
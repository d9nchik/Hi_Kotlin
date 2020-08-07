import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    // put your code here
    println(Colors.valueOf(input.next()).ordinal+1)
}

enum class Colors {
    red, orange, yellow, green, blue, indigo, violet
}
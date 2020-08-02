import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val word=input.next()
    for (letter in 'a'..'z'){
        if (letter !in word){
            print(letter)
        }
    }
    println()
}
import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val str = input.next()

    var counter=0
    for (ind in str.indices){
        val ch = str[ind]
        if (str.lastIndexOf(ch)==str.indexOf(ch))
            counter++
    }
    println(counter)
}
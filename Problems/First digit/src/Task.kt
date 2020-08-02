import java.util.*
import kotlin.system.exitProcess

fun main() {
    val input  = Scanner(System.`in`)
    for (i in input.next().chars()){
        val symb = i.toChar()
        if (symb.isDigit()){
            println(symb)
            exitProcess(0)
        }
    }
}
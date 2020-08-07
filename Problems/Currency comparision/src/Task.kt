import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    try{
        println(Currencies.valueOf(input.next()).currenc == Currencies.valueOf(input.next()).currenc)
    }catch (ex: IllegalArgumentException){
        println(false)
    }

}

enum class Currencies(val currenc: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar")
}
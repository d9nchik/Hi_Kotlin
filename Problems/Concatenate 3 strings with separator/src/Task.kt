import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val arr = MutableList(4) { "" }
    for (ind in arr.indices) {
        arr[ind] = input.nextLine()
    }
    if (arr.last() == "NO SEPARATOR")
        arr[arr.lastIndex] = " "
    for (ind in 0 until arr.lastIndex - 1)
        print("${arr[ind]}${arr.last()}")
    println(arr[arr.lastIndex - 1])
}
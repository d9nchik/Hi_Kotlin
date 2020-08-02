import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    var number: Int

    while (true){
        number=scanner.nextInt()
        if (number==0)
            break
        sum += number
    }
    println(sum)
}
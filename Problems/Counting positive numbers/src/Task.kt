import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var counter=0
    repeat(scanner.nextInt()){
        if (scanner.nextInt()>0)
            counter++
    }
    print(counter)
}
import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val str = input.next()

    var password: String = ""
    str.split("?")[1].split("&").stream().map { e -> e.split("=") }
            .forEach { e ->
                run {
                    if (e[0] == "pass" && e[1].isNotEmpty())
                        password = "password : ${e[1]}"
                    println("${e[0]} : ${if (e[1].isEmpty()) "not found" else e[1]}")
                }
            }
    if (password.isNotEmpty())
        println(password)

}
import java.util.*

fun main() {
    val words = mutableMapOf<String, Int>()
    val input = Scanner(System.`in`)

    while (true) {
        val word = input.next()
        if (word == "stop")
            break
        if (words.containsKey(word))
            words[word] = words[word]!!.plus(1)
        else
            words[word] = 1
    }

    var word = "null"
    var count = 0
    words.forEach { entry ->
        if (entry.value > count) {
            word = entry.key; count = entry.value
        }
    }

    println(word)
}
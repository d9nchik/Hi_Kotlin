import java.util.Scanner

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Client) {
            val cl: Client = other
            return cl.name == this.name && cl.age == this.age
        }
        return false
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val input = Scanner(System.`in`)
    val f = Client(input.next(), input.nextInt(), input.nextInt())
    val s = Client(input.next(), input.nextInt(), input.nextInt())
    println(s == f)
}
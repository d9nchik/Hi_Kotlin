fun main() {
    val productType = readLine()!!
    val price = readLine()!!
    val product = Product(price.toInt(), productType)
    println(product.totalPrice())
}

class Product(private val price: Int, private val productType: String) {
    fun totalPrice(): Int {
        return ((1 + when (productType) {
            "headphones" -> 11
            "smartphone" -> 15
            "tv" -> 17
            else -> 19
        } / 100.0) * price).toInt()
    }
}
fun main() {
    val rooms = readLine()!!
    val price = readLine()!!
    val house = House(rooms.toInt(), price.toDouble())
    println(house.totalPrice())
}

class House(private var rooms: Int, private val price: Double) {
    private var coefficient: Double

    init {
        if (rooms < 1)
            rooms = 1

        coefficient = when (rooms) {
            1 -> 1.0
            2, 3 -> 1.2
            4 -> 1.25
            in 5..7 -> 1.4
            else -> 1.6
        }

    }


    fun totalPrice(): Int {
        return (price * coefficient).toInt()
    }
}
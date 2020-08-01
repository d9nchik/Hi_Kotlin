fun main() {
    val longs = LongArray(3)
    for (x in longs.indices) {
        longs[x] = 100_000_000_000 + x + 1
    }
    println(longs.joinToString())
}
import java.util.Scanner

// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // implement your code here
    val array = IntArray(4)
    for (ind in 0..array.lastIndex){
        array[ind]=input.nextInt()
    }
    val box = Box(array[0], array[1], array.last())
    val box2 = box.copy(length = array[2])
    println(box)
    println(box2)
}
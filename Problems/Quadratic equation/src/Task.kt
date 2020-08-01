import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    val a = 2 * scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val discriminant = sqrt(b * b - 2 * a * c)
    val x1 = (-b + discriminant) / a
    val x2 = (-b - discriminant) / a

    println(if (x1<x2) "$x1 $x2" else "$x2 $x1")

}
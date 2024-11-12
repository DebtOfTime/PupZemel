package par4

import java.lang.Math.pow
import kotlin.math.*

class Point(val x: Double, val y: Double)
class Triangle(val a: Point, val b: Point, val c: Point) {
    fun inradius(): Double {
        val ab = a.distanceTo(b)
        val ac = a.distanceTo(c)
        val bc = b.distanceTo(c)
        val p = (ab + ac + bc) / 2.0
        val s = sqrt(p * (p - ab) * (p - ac) * (p - bc))
        return s/p
    }

    // Метод для вычисления координат центра вписанной окружности
    fun incenter(): Point {
        val aLength = b.distanceTo(c)
        val bLength = a.distanceTo(c)
        val cLength = a.distanceTo(b)
        val x = (aLength * a.x + bLength * b.x + cLength * c.x) / (aLength + bLength + cLength)
        val y = (aLength * a.y + bLength * b.y + cLength * c.y) / (aLength + bLength + cLength)
        return Point(x, y)
    }
}

// Расширение класса Point для вычисления расстояния между двумя точками
fun Point.distanceTo(other: Point): Double {
    return sqrt(pow(other.x - x, 2.0) + pow(other.y - y, 2.0))
}

fun main() {
    println("Введите координаты вершины A (x y):")
    val a = readLine()?.split(" ")?.let { Point(it[0].toDouble(), it[1].toDouble()) }
    println("Введите координаты вершины B (x y):")
    val b = readLine()?.split(" ")?.let { Point(it[0].toDouble(), it[1].toDouble()) }
    println("Введите координаты вершины C (x y):")
    val c = readLine()?.split(" ")?.let { Point(it[0].toDouble(), it[1].toDouble()) }

    val triangle = Triangle(a!! ,b!! , c!!)

    // Вычисление координат центра и радиуса вписанной окружности
    val incenter = triangle.incenter()
    val inradius = triangle.inradius()

    // Вывод результата
    println("Координаты центра вписанной окружности: (${incenter.x}, ${incenter.y})")
    println("Радиус вписанной окружности: $inradius")
}
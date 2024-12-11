package Poezd

import kotlin.random.Random

fun main() {
    val Passangers = Random.nextInt(5,202)
    val cities = listOf("Москва", "Санкт-Петербург", "Казань", "Екатеринбург", "Новосибирск")
    val train = SamPoezd(Passangers, cities)
    println("Всего пассажиров: ${Passangers}")
}
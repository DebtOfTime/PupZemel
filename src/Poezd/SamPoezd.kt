package Poezd

import kotlin.random.Random

class SamPoezd(
    private val passengers: Int,
    private val cities: List<String>
) {
    private val wagons = mutableListOf<Wagon>()

    init {
        val (city1, city2) = selectCities()
        println("Маршрут поезда: $city1 -> $city2")
        calculateWagons()
    }

    private fun selectCities(): Pair<String, String> {
        val city1 = cities.random()
        val city2 = cities.filter { it != city1 }.random()
        return Pair(city1, city2)
    }

    private fun calculateWagons() {
        var remainingPassengers = passengers
        while (remainingPassengers > 0) {
            val capacity = Random.nextInt(5, 26)
            val wagon = Wagon(capacity)
            wagons.add(wagon)
            remainingPassengers -= capacity
            println("Добавлен вагон на $capacity мест(-а)")
        }
        println("Общее количество вагонов: ${wagons.size}")
        val totalCapacity = wagons.sumOf { it.capacity }
        val freeSeats = totalCapacity - passengers
        println("Количество свободных мест: $freeSeats")
    }

    private class Wagon(val capacity: Int)
}
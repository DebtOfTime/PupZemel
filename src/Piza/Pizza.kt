package Piza

import kotlin.system.exitProcess

fun main() {
    val pizzaPeter = PizzaPeter(
        175.3, 241.5,
        167.5, 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.3, 250.5,
        180.5, 240.0
    )
    val currentPizzaCity: PizzaCity
    println("Добрый день! Выберите город")
    println("1. Москва\n2. Санкт-Петербург\n")
    val city = readln()
    if (city == "1") {
        currentPizzaCity = pizzaMoscow
    } else if (city == "2") {
        currentPizzaCity = pizzaPeter
    }
    else {
        println("ERROR")
        exitProcess(1)
    }
    println("Выберите пиццу:")
    println("1. Hеаполитанская пицца\\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
    when (readln()) {
        "1" -> currentPizzaCity.neapolitanPizzaSale()
        "2" -> currentPizzaCity.romanPizzaSale()
        "3" -> currentPizzaCity.sicilianPizzaSale()
        "4" -> currentPizzaCity.tyroleanPizzaSale()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}
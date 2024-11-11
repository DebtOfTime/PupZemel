package par2

fun main() {
    println("строк:")
    val rows = readLine()!!.toInt()
    println("столбцов:")
    val cols = readLine()!!.toInt()
    val array = Array(rows) { Array(cols) { 0 } }
    println("Введите элементы массива (трехзначные числа):")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            val input = readLine()?.toInt()
            if (input != null && input in 100..999) {
                array[i][j] = input
            } else {
                error("Некорректный ввод числа. Введите трехзначное число.")
            }
        }
    }
    val flattenedArray = array.flatten()
    val distinctDigits = flattenedArray.distinctBy { it.toString().toCharArray().toSet() }.count()
    println("Двумерный массив:")
    for (row in array) {
        println(row.joinToString("  "))
    }
    println("В массиве использовано $distinctDigits различных цифр.")
}
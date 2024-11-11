package par2

fun main() {
    val array = Array(5) { Array(5) { 0 } }
    println("Введите элементы массива (5x5):")
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            val input = readLine()?.toInt()
            if (input != null) {
                array[i][j] = input
            }
        }
    }
    var isSymmetric = true
    for (i in 0 until 5) {
        for (j in i + 1 until 5) {
            if (array[i][j] != array[j][i]) {
                isSymmetric = false
                break
            }
        }
        if (!isSymmetric) break
    }
    if (isSymmetric) {
        println("Массив симметричен относительно главной диагонали.")
    } else {
        println("Массив не симметричен относительно главной диагонали.")
    }
}
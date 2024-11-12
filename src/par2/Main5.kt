package par2

fun main() {
    println("Введите массив слов (через пробел):")
    val words = readLine()?.split(" ")

    // Группируем слова по сортированным наборам букв
    val groupedWords = words!!.groupBy { it.toCharArray().sorted().joinToString("") }

    // Преобразуем мапу в список строк, где каждое слово в группе объединяется в строку
    val result = groupedWords.map { (key, value) -> value.joinToString(" ") }

    println("Группировка слов:")
    for (group in result) { // Выводим каждую группу слов
        println(group)
    }
}
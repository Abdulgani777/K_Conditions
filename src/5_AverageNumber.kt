fun main() {
    println("Введите три произвольных числа:")

    val a = readLine()?.toDoubleOrNull()
    val b = readLine()?.toDoubleOrNull()
    val c = readLine()?.toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Некорректный ввод. Пожалуйста, введите числовые значения.")
        return
    }

    // Проверяем совпадения
    if (a == b || b == c || a == c) {
        println("Ошибка")
        return
    }

    // Находим среднее по значению (не арифметическое)
    val middle = when {
        (a > b && a < c) || (a < b && a > c) -> a
        (b > a && b < c) || (b < a && b > c) -> b
        else -> c
    }

    println("Среднее число: $middle")
}

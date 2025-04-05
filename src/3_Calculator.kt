fun main() {
    val num1 = 2
    val num2 = 6
    println("У вас есть числа: $num1 и $num2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    print("Выберите действие: ")
    when (readLine()?.toIntOrNull()) {
        1 -> println("Результат: ${num1 + num2}")
        2 -> println("Результат: ${num1 - num2}")
        0 -> println("Ничего не изменилось")
        else -> println("Неверный выбор")
    }
}
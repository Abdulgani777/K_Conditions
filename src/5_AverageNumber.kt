fun main() {
    val num1 = 100
    val num2 = 154
    val num3 = 12
    val average = if (num1 == num2 || num2 == num3 || num1 == num3) {
        "Ошибка"
    } else {
        (num1 + num2 + num3) / 3
    }
    println("Среднее число: $average")
}
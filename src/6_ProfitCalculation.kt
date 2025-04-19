fun main() {
    val export = 1000
    val import = 750
    val balance = export - import
    if (balance > 0) {
        println("Ваша прибыль составила: $balance")
    } else {
        println("Ваши убытки составили: ${-balance}")
    }
}
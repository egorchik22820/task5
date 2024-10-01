fun findExponent(n: Int, x: Int): String {
    if (x == 1 && n == 1) return "y может быть любым целым числом"
    if (x == 1 && n != 1) return "Целочисленный показатель не существует"

    var y = 0
    var currentResult = 1

    while (currentResult < n) {
        currentResult *= x
        y++
    }

    return if (currentResult == n) {
        "Показатель степени y = $y"
    } else {
        "Целочисленный показатель не существует"
    }
}

fun main() {
    println("Введите число n:")
    val n = readLine()?.toIntOrNull() ?: return println("Неверный ввод")

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull() ?: return println("Неверный ввод")

    val result = findExponent(n, x)
    println(result)
}

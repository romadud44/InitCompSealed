import Coffee.*
import kotlinx.coroutines.delay

suspend fun main() {
    selectMenu()
}
suspend fun selectMenu() {
    var milk = 0
    println("Выберите напиток:\n1. Americano\n2. Cappuccino\n3. Latte")
    val name: String = when (readln()) {
        "1" -> "Americano"
        "2" -> "Cappuccino"
        "3" -> "Latte"
        else -> "Americano"
    }
    println("Выберите количество сахара(0-10)")
    val sugar: Int = readln().toInt()
    println("Выберите объём стакана(0.2 - 0.5")
    val glass = readln().toDouble()
    if (name == "Cappuccino") {
        println("Выберите количество молока(1-10)")
        milk = readln().toInt()
    }
    val drink: Any = when (name) {
        "Americano" -> {
            Americano("Американо", sugar, glass)
        }
        "Cappuccino" -> {
            Cappuccino("Капучино", sugar, glass, milk)
        }
        "Latte" -> {
            Latte("Латте", sugar, glass)
        }
        else -> println("Машина сломалась, приходите позже")
    }
    load()
    println("Ваш кофе готов: $drink")
}

suspend fun load() {
    for (i in 1..10) {
        delay(500L)
        print("${i * 10}% ")
    }
    println()
}


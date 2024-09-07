sealed class Coffee {
    class Americano(private var name: String, private var sugar: Int, private var glass: Double) : Coffee() {
        init {
            if (name.isEmpty()) name = "Americano"
            if (sugar < 0) sugar = 0
            if (sugar > 10) sugar = 10
            if (glass <= 0.0) glass = 0.2
            if (glass > 0.5) glass = 0.5
        }

        override fun toString(): String {
            return "$name, Сахар: $sugar, Стакан: $glass)"
        }
    }

    class Cappuccino(
        private var name: String,
        private var sugar: Int,
        private var glass: Double,
        private var milk: Int
    ) : Coffee() {
        init {
            if (name.isEmpty()) name = "Cappuccino"
            if (sugar < 0) sugar = 0
            if (sugar > 10) sugar = 10
            if (glass < 0.0) glass = 0.2
            if (glass > 0.5) glass = 0.5
            if (milk < 0) milk = 1
            if (milk > 10) milk = 10
        }

        override fun toString(): String {
            return "$name, Сахар: $sugar, Стакан: $glass, молоко: $milk)"
        }
    }

    class Latte(private var name: String, private var sugar: Int, private var glass: Double) : Coffee() {
        init {
            if (name.isEmpty()) name = "Latte"
            if (sugar < 0) sugar = 0
            if (sugar > 10) sugar = 10
            if (glass < 0.0) glass = 0.2
            if (glass > 0.5) glass = 0.5
        }

        override fun toString(): String {
            return "$name, Сахар: $sugar, Стакан: $glass)"
        }
    }

}

